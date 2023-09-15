package my.com.lcsb.korok.config.user;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(unique = true)
    @NotNull(message = "No cannot be null")
    String email;

    @NotNull(message = "No cannot be null")
    @Column(length = 10, unique = true)
    String staffId;

    @Column(columnDefinition = "LONGTEXT")
    private String signature;
    @ElementCollection(fetch = javax.persistence.FetchType.EAGER)
    private List<String> roles;
}
