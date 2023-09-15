package my.com.lcsb.korok.config.menu;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MenuRoleRepository extends JpaRepository<MenuRole, Long> {
    Optional<MenuRole> findByRole(String role);

    @Query("select m.role from MenuRole m order by m.id asc")
    List<String> findAllRole();
}
