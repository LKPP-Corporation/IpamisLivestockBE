package my.com.lcsb.korok.features;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "species_info", schema = "ipamis_mdsb", catalog = "")
public class SpeciesInfo {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "code")
    private String code;
    @Basic
    @Column(name = "descp")
    private String descp;
    @Basic
    @Column(name = "abbreviation")
    private String abbreviation;
    @Basic
    @Column(name = "spesifik")
    private String spesifik;
    @Basic
    @Column(name = "entercode")
    private String entercode;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescp() {
        return descp;
    }

    public void setDescp(String descp) {
        this.descp = descp;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getSpesifik() {
        return spesifik;
    }

    public void setSpesifik(String spesifik) {
        this.spesifik = spesifik;
    }

    public String getEntercode() {
        return entercode;
    }

    public void setEntercode(String entercode) {
        this.entercode = entercode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SpeciesInfo that = (SpeciesInfo) o;
        return Objects.equals(code, that.code) && Objects.equals(descp, that.descp) && Objects.equals(abbreviation, that.abbreviation) && Objects.equals(spesifik, that.spesifik) && Objects.equals(entercode, that.entercode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, descp, abbreviation, spesifik, entercode);
    }
}
