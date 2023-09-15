package my.com.lcsb.korok.config.menu;

import java.text.MessageFormat;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.apache.commons.lang.StringUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class MenuService {
    private MenuRepository menuRepository;
    private MenuRoleRepository menuRoleRepository;

    public MenuService(MenuRepository menuRepository, MenuRoleRepository menuRoleRepository) {
        this.menuRepository = menuRepository;
        this.menuRoleRepository = menuRoleRepository;
    }

    // public List<Menu> getAll() {
    // return this.menuRepository.findAll();
    // }

    public List<Menu> getAll(String role) {
        log.debug("role {}", role);
        return this.menuRoleRepository.findByRole(role).orElseThrow().getMenus();
    }

    public List<String> getAllRole() {
        return this.menuRoleRepository.findAllRole();
    }

    public Page<Menu> findAll(String filter, Pageable pageable) {
        Specification<Menu> spec = getSpec(filter);
        // Fetch filtered and paginated data using the SoilInfoRepository
        return menuRepository.findAll(spec, pageable);
    }

    private static Specification<Menu> getSpec(String filter) {
        if (filter == null || filter.isEmpty()) {
            return (root, query, cb) -> {
                return cb.conjunction();
            };
        }

        Specification<Menu> specid = StringUtils.isNumeric(filter)
                ? (root, query, builder) -> builder.equal(root.get("id"), filter)
                : null;

        String filterPattern = MessageFormat.format("%{0}%", filter.toLowerCase());
        Specification<Menu> speclabel = (root, query, cb) -> cb.like(cb.lower(root.get("label")), filterPattern);

        return Specification.where(specid).or(speclabel);
    }

    public Menu save(Menu menu) {
        return this.menuRepository.save(menu);
    }

    public void delete(Long id) {
        this.menuRepository.deleteById(id);
    }

    public Optional<Menu> findById(Long id) {
        Optional<Menu> menu = this.menuRepository.findById(id);
        if (menu.isPresent()) {
            menu.get().setTempMasterId(menu.get().getMaster() == null ? null : menu.get().getMaster().getId());
        }
        return menu;
    }

    public List<Menu> findAllHeader() {
        return this.menuRepository.getAllHeader().stream().map(menu -> {
            menu.setTempMasterId(null);
            return menu;
        }).collect(Collectors.toList());
        // return this.menuRepository.findAll().stream()
        // .filter(m -> m.getRouterLink().size() == 0)
        // .collect(Collectors.toList());
    }

}
