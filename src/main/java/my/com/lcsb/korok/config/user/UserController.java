package my.com.lcsb.korok.config.user;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
//import my.com.lcsb.korok.config.menu.Menu;
import my.com.lcsb.korok.config.menu.MenuService;
import my.com.lcsb.korok.utilities.SortUtils;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/user")
public class UserController {
    final private UserService userService;
    final private MenuService menuService;

    @GetMapping("/list")
    ResponseEntity<?> searchUser(@RequestParam(required = false, defaultValue = "0") int page,
            @RequestParam(required = false, defaultValue = "10") int size,
            @RequestParam(required = false) String sort,
            @RequestParam(required = false, defaultValue = "") String filter) {
        Pageable pageable = PageRequest.of(page, size, Sort.by(SortUtils.getSortOrder(sort)));
        return ResponseEntity.ok(userService.findAll(filter, pageable));
    }

    @Transactional
    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        this.userService.delete(id);
    }

    @Transactional(readOnly = true)
    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id) {
        Optional<User> user = this.userService.findById(id);
        if (!user.isPresent()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(this.userService.findById(id));
    }

    @Transactional
    @PostMapping("")
    public ResponseEntity<?> save(@Valid @RequestBody User user) {
        log.debug("save {}", user);
        return ResponseEntity.ok(this.userService.save(user));
    }

    @Transactional(readOnly = true)
    @GetMapping("/roles")
    public ResponseEntity<?> getAllRole() {
        return ResponseEntity.ok(this.menuService.getAllRole());
    }

}
