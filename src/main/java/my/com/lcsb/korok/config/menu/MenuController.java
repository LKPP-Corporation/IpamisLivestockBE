package my.com.lcsb.korok.config.menu;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import my.com.lcsb.korok.config.user.UserService;
import my.com.lcsb.korok.utilities.SortUtils;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/menu")
public class MenuController {
    private final MenuService menuService;
    private final UserService penggunaService;

    @Transactional(readOnly = true)
    @GetMapping("")
    public ResponseEntity<List<Menu>> getAllMenu(@AuthenticationPrincipal Jwt user) {
        // log.info("principal {}", user);
        String email = user.getClaimAsString("email");
        log.debug("menu email {}", email);
        String role = this.penggunaService.getHighestRoleByEmail(email);
        log.debug("menu role {} {}", role, role.length());
        List<Menu> lm = this.menuService.getAll(role);
        log.debug("menu {}", lm);
        return ResponseEntity.ok(lm);
    }

    @Transactional(readOnly = true)
    @GetMapping("/{id}")
    public ResponseEntity<?> getMenuById(@PathVariable Long id) {
        Optional<Menu> menu = this.menuService.findById(id);
        if (!menu.isPresent()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(menu.get());
    }

    @Transactional
    @PostMapping("")
    public ResponseEntity<?> save(@RequestBody Menu entity) {
        if (entity.getTempMasterId() != null) {
            entity.setMaster(this.menuService.findById(entity.getTempMasterId()).orElseThrow());
        }
        return ResponseEntity.ok(this.menuService.save(entity));
    }

    // delete menu by id
    @Transactional
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        this.menuService.delete(id);
    }

    @GetMapping("/list")
    ResponseEntity<?> searchUser(@RequestParam(required = false, defaultValue = "0") int page,
            @RequestParam(required = false, defaultValue = "10") int size,
            @RequestParam(required = false) String sort,
            @RequestParam(required = false, defaultValue = "") String filter) {
        Pageable pageable = PageRequest.of(page, size, Sort.by(SortUtils.getSortOrder(sort)));
        return ResponseEntity.ok(menuService.findAll(filter, pageable));
    }

    @Transactional(readOnly = true)
    @GetMapping("/top")
    public ResponseEntity<?> getAllMenus() {
        return ResponseEntity.ok(this.menuService.findAllHeader());
    }

}
