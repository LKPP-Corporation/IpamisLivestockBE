package my.com.lcsb.korok.config.user;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.apache.commons.lang.StringUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import my.com.lcsb.korok.features.soil.Soil;

@RequiredArgsConstructor
@Service
public class UserService {
    final private UserRepository userRepository;

    public Optional<User> findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    public Optional<User> findById(Long id) {
        return userRepository.findById(id);

    }

    public List<String> getRolesByEmail(String email) {
        Optional<User> user = userRepository.findByEmail(email);
        List<String> roles = new ArrayList<String>();
        if (user.isPresent()) {
            user.get().getRoles().forEach(v -> roles.add("ROLE_".concat(v)));
        } else
            roles.add("ROLE_".concat("USER"));

        return roles;
    }

    public User save(User user) {
        return this.userRepository.save(user);
    }

    public void delete(String email) {
        this.userRepository.deleteByEmail(email);
    }

    public Page<User> findAll(String filter, Pageable pageable) {
        Specification<User> spec = getSpec(filter);
        // Fetch filtered and paginated data using the SoilInfoRepository
        return userRepository.findAll(spec, pageable);
    }

    private static Specification<User> getSpec(String filter) {
        if (filter == null || filter.isEmpty()) {
            return (root, query, cb) -> {
                return cb.conjunction();
            };
        }

        Specification<User> specid = StringUtils.isNumeric(filter)
                ? (root, query, builder) -> builder.equal(root.get("id"), filter)
                : null;

        String filterPattern = MessageFormat.format("%{0}%", filter.toLowerCase());
        Specification<User> specname = (root, query, cb) -> cb.like(cb.lower(root.get("staffId")), filterPattern);
        Specification<User> specremark = (root, query, cb) -> cb.like(cb.lower(root.get("email")), filterPattern);

        return Specification.where(specid).or(specname).or(specremark);
    }

    public String getHighestRoleByEmail(String email) {
        return this.getHighestRole(this.getRolesByEmail(email));
    }

    // USER > CHECKER > APPROVER > ADMIN
    private String getHighestRole(List<String> roles) {
        if (roles.isEmpty())
            return "USER";
        if (roles.size() == 1)
            return roles.get(0);
        int p = 99;
        for (String role : roles) {
            int k = -1;
            switch (role) {
                case "ROLE_USER":
                    k = 3;
                    break;
                case "ROLE_CHECKER":
                    k = 2;
                    break;
                case "ROLE_APPROVER":
                    k = 1;
                    break;
                case "ROLE_ADMIN":
                    k = 0;
                    break;
                default:
                    k = 99;
            }
            if (k < p)
                p = k;
        }
        switch (p) {
            case 2:
                return "CHECKER";
            case 1:
                return "APPROVER";
            case 0:
                return "ADMIN";
            default:
                return "USER";
        }
    }
}
