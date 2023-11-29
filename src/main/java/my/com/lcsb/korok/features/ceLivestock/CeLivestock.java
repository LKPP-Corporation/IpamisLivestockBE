package my.com.lcsb.korok.features.ceLivestock;

import java.math.BigDecimal;
//import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


import lombok.Data;

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

    private int entercode;
    private int breedcode;

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

}
