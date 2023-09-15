package my.com.lcsb.korok.features.livestockgroup;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "product_info", schema = "ipamis_mdsb", catalog = "")
public class ProductInfo {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "code")
    private String code;
    @Basic
    @Column(name = "descp")
    private String descp;
    @Basic
    @Column(name = "coa")
    private String coa;
    @Basic
    @Column(name = "coadescp")
    private String coadescp;
    @Basic
    @Column(name = "spesifik")
    private String spesifik;
    @Basic
    @Column(name = "entercode")
    private String entercode;
    @Basic
    @Column(name = "major")
    private String major;
    @Basic
    @Column(name = "measure")
    private String measure;

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

    public String getCoa() {
        return coa;
    }

    public void setCoa(String coa) {
        this.coa = coa;
    }

    public String getCoadescp() {
        return coadescp;
    }

    public void setCoadescp(String coadescp) {
        this.coadescp = coadescp;
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

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getMeasure() {
        return measure;
    }

    public void setMeasure(String measure) {
        this.measure = measure;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductInfo that = (ProductInfo) o;
        return Objects.equals(code, that.code) && Objects.equals(descp, that.descp) && Objects.equals(coa, that.coa) && Objects.equals(coadescp, that.coadescp) && Objects.equals(spesifik, that.spesifik) && Objects.equals(entercode, that.entercode) && Objects.equals(major, that.major) && Objects.equals(measure, that.measure);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, descp, coa, coadescp, spesifik, entercode, major, measure);
    }
}
