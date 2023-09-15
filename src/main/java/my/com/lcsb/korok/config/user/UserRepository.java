package my.com.lcsb.korok.config.user;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface UserRepository extends JpaRepository<User, Long>, JpaSpecificationExecutor<User> {
    void deleteByEmail(String email);

    Optional<User> findByEmail(String email);
}
