package my.com.lcsb.korok.features.ceLivestockstatus;
/*import java.math.BigDecimal;
import java.time.LocalDate;*/

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.data.annotation.Transient;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Data;
import my.com.lcsb.korok.features.buyerInfo.BuyerInfo;
import my.com.lcsb.korok.features.ceLivestock.CeLivestock;

@Data
@Entity
public class CeLivestockstatus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // @Column(length = 50)
    // private String regid;

    @Column(length = 100)
    private String currstatus;

    @Column(length = 100)
    private String status;
    private LocalDate chgdate;
    private LocalDate transdate;

    private boolean current;
    
    @Column(precision = 20, scale = 2)
    private BigDecimal soldamt;

    @Column(length = 255, columnDefinition = "TEXT")
    private String remark;

    @ManyToOne
    private BuyerInfo buyer;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "regid")
    CeLivestock master;

    @Transient
    private String tempMasterId;
    
}
