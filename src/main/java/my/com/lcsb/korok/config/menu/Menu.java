package my.com.lcsb.korok.config.menu;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Builder(toBuilder = true)
@AllArgsConstructor(access = AccessLevel.PACKAGE)
@NoArgsConstructor(access = AccessLevel.PACKAGE)
@Setter(value = AccessLevel.PACKAGE)
@Getter
@EqualsAndHashCode
@ToString
public class Menu {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String label;
        @ElementCollection
        private List<String> routerLink;
        private String icon;

        @JsonManagedReference
        @OneToMany(mappedBy = "master", cascade = CascadeType.ALL, orphanRemoval = true)
        @ToString.Exclude
        private List<Menu> items;

        @Transient
        private Long tempMasterId;

        @ToString.Exclude
        @JsonBackReference
        @ManyToOne
        // @JoinColumn(name = "menu_id")
        private Menu master;

        @Column(columnDefinition = "boolean default true")
        private boolean expanded;
        @Column(columnDefinition = "boolean default false")
        private boolean disabled;
        @Column(columnDefinition = "boolean default true")
        private boolean visible;
        @Column(name = "sepa", columnDefinition = "boolean default false")
        private boolean separator;

}
