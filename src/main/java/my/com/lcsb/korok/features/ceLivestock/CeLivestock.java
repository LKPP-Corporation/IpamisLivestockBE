package my.com.lcsb.korok.features.ceLivestock;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.CascadeType;
//import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Data;
import my.com.lcsb.korok.features.ceLivestockstatus.CeLivestockstatus;

@Data
@Entity
public class CeLivestock {
    @Id
    @Column(length = 50)
    private String id;

    @Column(length = 50)
    private String tagid;

     private String name;
     private String sex;

     @Column(length = 50)
    private String currstatus;

    private String entercode;
    private String breedcode;

    @Column(length = 200)
    private String enterdesc;

    @Column(length = 200)
    private String breeddesc;

    private String dob;

    private String purchasedt;
    
    @Column(precision = 20, scale = 2)
    private BigDecimal purchaseamt;

    @Column(length = 200)
    private String origin;

    private String sire;

    private String dam;

    @JsonManagedReference
    @OneToMany(mappedBy = "master",cascade = CascadeType.ALL)
    private List<CeLivestockstatus> statusList;

}
