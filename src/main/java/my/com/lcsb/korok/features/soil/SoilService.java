package my.com.lcsb.korok.features.soil;

import java.text.MessageFormat;
import java.util.Optional;

import org.apache.commons.lang.StringUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;
//import my.com.lcsb.korok.config.menu.Menu;

@RequiredArgsConstructor
@Service
public class SoilService {

    final private SoilRepository soilRepository;

    public Soil save(Soil soil) {
        return soilRepository.save(soil);
    }

    public Optional<Soil> findById(Long id) {
        return soilRepository.findById(id);
    }

    // delete soil
    public void delete(Long id) {
        soilRepository.deleteById(id);
    }

    public Page<Soil> findAll(String filter, Pageable pageable) {
        Specification<Soil> spec = getSpec(filter);
        return soilRepository.findAll(spec, pageable);
    }

    private static Specification<Soil> getSpec(String filter) {
        if (filter == null || filter.isEmpty()) {
            return (root, query, cb) -> {
                return cb.conjunction();
            };
        }

        Specification<Soil> specid = StringUtils.isNumeric(filter)
                ? (root, query, builder) -> builder.equal(root.get("id"), filter)
                : null;

        String filterPattern = MessageFormat.format("%{0}%", filter.toLowerCase());
        Specification<Soil> specname = (root, query, cb) -> cb.like(cb.lower(root.get("name")), filterPattern);
        Specification<Soil> specremark = (root, query, cb) -> cb.like(cb.lower(root.get("remark")), filterPattern);

        return Specification.where(specid).or(specname).or(specremark);
    }

}
