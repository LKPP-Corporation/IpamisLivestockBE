package my.com.lcsb.korok.features.ceLivestock;

import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class CeLivestock {
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    
    @Column(length = 50)
    private String name;
}
