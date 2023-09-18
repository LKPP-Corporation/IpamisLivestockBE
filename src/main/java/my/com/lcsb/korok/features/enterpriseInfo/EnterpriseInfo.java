package my.com.lcsb.korok.features.enterpriseInfo;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "enterprise_info", schema = "ipamis_mdsb", catalog = "")
public class EnterpriseInfo {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "code")
    private String code;
    @Basic
    @Column(name = "descp")
    private String descp;
    @Basic
    @Column(name = "type")
    private String type;
    @Basic
    @Column(name = "spesifik")
    private String spesifik;
    @Basic
    @Column(name = "productcode")
    private String productcode;
    @Basic
    @Column(name = "productcode1")
    private String productcode1;
    @Basic
    @Column(name = "productcode2")
    private String productcode2;
    @Basic
    @Column(name = "productcode3")
    private String productcode3;
    @Basic
    @Column(name = "productcode4")
    private String productcode4;
    @Basic
    @Column(name = "productcode5")
    private String productcode5;
    @Basic
    @Column(name = "productcode6")
    private String productcode6;
    @Basic
    @Column(name = "productcode7")
    private String productcode7;
    @Basic
    @Column(name = "productcode8")
    private String productcode8;
    @Basic
    @Column(name = "productcode9")
    private String productcode9;
    @Basic
    @Column(name = "productdescp")
    private String productdescp;
    @Basic
    @Column(name = "productdescp1")
    private String productdescp1;
    @Basic
    @Column(name = "productdescp2")
    private String productdescp2;
    @Basic
    @Column(name = "productdescp3")
    private String productdescp3;
    @Basic
    @Column(name = "productdescp4")
    private String productdescp4;
    @Basic
    @Column(name = "productdescp5")
    private String productdescp5;
    @Basic
    @Column(name = "productdescp6")
    private String productdescp6;
    @Basic
    @Column(name = "productdescp7")
    private String productdescp7;
    @Basic
    @Column(name = "productdescp8")
    private String productdescp8;
    @Basic
    @Column(name = "productdescp9")
    private String productdescp9;
    @Basic
    @Column(name = "coacode")
    private String coacode;
    @Basic
    @Column(name = "coacode1")
    private String coacode1;
    @Basic
    @Column(name = "coacode2")
    private String coacode2;
    @Basic
    @Column(name = "coacode3")
    private String coacode3;
    @Basic
    @Column(name = "coacode4")
    private String coacode4;
    @Basic
    @Column(name = "coacode5")
    private String coacode5;
    @Basic
    @Column(name = "coacode6")
    private String coacode6;
    @Basic
    @Column(name = "coacode7")
    private String coacode7;
    @Basic
    @Column(name = "coacode8")
    private String coacode8;
    @Basic
    @Column(name = "coacode9")
    private String coacode9;
    @Basic
    @Column(name = "coadescp")
    private String coadescp;
    @Basic
    @Column(name = "coadescp1")
    private String coadescp1;
    @Basic
    @Column(name = "coadescp2")
    private String coadescp2;
    @Basic
    @Column(name = "coadescp3")
    private String coadescp3;
    @Basic
    @Column(name = "coadescp4")
    private String coadescp4;
    @Basic
    @Column(name = "coadescp5")
    private String coadescp5;
    @Basic
    @Column(name = "coadescp6")
    private String coadescp6;
    @Basic
    @Column(name = "coadescp7")
    private String coadescp7;
    @Basic
    @Column(name = "coadescp8")
    private String coadescp8;
    @Basic
    @Column(name = "coadescp9")
    private String coadescp9;
    @Basic
    @Column(name = "spesifikproduct")
    private String spesifikproduct;
    @Basic
    @Column(name = "spesifikproduct1")
    private String spesifikproduct1;
    @Basic
    @Column(name = "spesifikproduct2")
    private String spesifikproduct2;
    @Basic
    @Column(name = "spesifikproduct3")
    private String spesifikproduct3;
    @Basic
    @Column(name = "spesifikproduct4")
    private String spesifikproduct4;
    @Basic
    @Column(name = "spesifikproduct5")
    private String spesifikproduct5;
    @Basic
    @Column(name = "spesifikproduct6")
    private String spesifikproduct6;
    @Basic
    @Column(name = "spesifikproduct7")
    private String spesifikproduct7;
    @Basic
    @Column(name = "spesifikproduct8")
    private String spesifikproduct8;
    @Basic
    @Column(name = "spesifikproduct9")
    private String spesifikproduct9;
    @Basic
    @Column(name = "clonecode")
    private String clonecode;
    @Basic
    @Column(name = "clonecode1")
    private String clonecode1;
    @Basic
    @Column(name = "clonecode2")
    private String clonecode2;
    @Basic
    @Column(name = "clonecode3")
    private String clonecode3;
    @Basic
    @Column(name = "clonecode4")
    private String clonecode4;
    @Basic
    @Column(name = "clonecode5")
    private String clonecode5;
    @Basic
    @Column(name = "clonecode6")
    private String clonecode6;
    @Basic
    @Column(name = "clonecode7")
    private String clonecode7;
    @Basic
    @Column(name = "clonecode8")
    private String clonecode8;
    @Basic
    @Column(name = "clonecode9")
    private String clonecode9;
    @Basic
    @Column(name = "clonedescp")
    private String clonedescp;
    @Basic
    @Column(name = "clonedescp1")
    private String clonedescp1;
    @Basic
    @Column(name = "clonedescp2")
    private String clonedescp2;
    @Basic
    @Column(name = "clonedescp3")
    private String clonedescp3;
    @Basic
    @Column(name = "clonedescp4")
    private String clonedescp4;
    @Basic
    @Column(name = "clonedescp5")
    private String clonedescp5;
    @Basic
    @Column(name = "clonedescp6")
    private String clonedescp6;
    @Basic
    @Column(name = "clonedescp7")
    private String clonedescp7;
    @Basic
    @Column(name = "clonedescp8")
    private String clonedescp8;
    @Basic
    @Column(name = "clonedescp9")
    private String clonedescp9;
    @Basic
    @Column(name = "abbreviationclone")
    private String abbreviationclone;
    @Basic
    @Column(name = "abbreviationclone1")
    private String abbreviationclone1;
    @Basic
    @Column(name = "abbreviationclone2")
    private String abbreviationclone2;
    @Basic
    @Column(name = "abbreviationclone3")
    private String abbreviationclone3;
    @Basic
    @Column(name = "abbreviationclone4")
    private String abbreviationclone4;
    @Basic
    @Column(name = "abbreviationclone5")
    private String abbreviationclone5;
    @Basic
    @Column(name = "abbreviationclone6")
    private String abbreviationclone6;
    @Basic
    @Column(name = "abbreviationclone7")
    private String abbreviationclone7;
    @Basic
    @Column(name = "abbreviationclone8")
    private String abbreviationclone8;
    @Basic
    @Column(name = "abbreviationclone9")
    private String abbreviationclone9;
    @Basic
    @Column(name = "spesifikclone")
    private String spesifikclone;
    @Basic
    @Column(name = "spesifikclone1")
    private String spesifikclone1;
    @Basic
    @Column(name = "spesifikclone2")
    private String spesifikclone2;
    @Basic
    @Column(name = "spesifikclone3")
    private String spesifikclone3;
    @Basic
    @Column(name = "spesifikclone4")
    private String spesifikclone4;
    @Basic
    @Column(name = "spesifikclone5")
    private String spesifikclone5;
    @Basic
    @Column(name = "spesifikclone6")
    private String spesifikclone6;
    @Basic
    @Column(name = "spesifikclone7")
    private String spesifikclone7;
    @Basic
    @Column(name = "spesifikclone8")
    private String spesifikclone8;
    @Basic
    @Column(name = "spesifikclone9")
    private String spesifikclone9;
    @Basic
    @Column(name = "speciescode")
    private String speciescode;
    @Basic
    @Column(name = "speciescode1")
    private String speciescode1;
    @Basic
    @Column(name = "speciescode2")
    private String speciescode2;
    @Basic
    @Column(name = "speciescode3")
    private String speciescode3;
    @Basic
    @Column(name = "speciescode4")
    private String speciescode4;
    @Basic
    @Column(name = "speciescode5")
    private String speciescode5;
    @Basic
    @Column(name = "speciescode6")
    private String speciescode6;
    @Basic
    @Column(name = "speciescode7")
    private String speciescode7;
    @Basic
    @Column(name = "speciescode8")
    private String speciescode8;
    @Basic
    @Column(name = "speciescode9")
    private String speciescode9;
    @Basic
    @Column(name = "speciesdescp")
    private String speciesdescp;
    @Basic
    @Column(name = "speciesdescp1")
    private String speciesdescp1;
    @Basic
    @Column(name = "speciesdescp2")
    private String speciesdescp2;
    @Basic
    @Column(name = "speciesdescp3")
    private String speciesdescp3;
    @Basic
    @Column(name = "speciesdescp4")
    private String speciesdescp4;
    @Basic
    @Column(name = "speciesdescp5")
    private String speciesdescp5;
    @Basic
    @Column(name = "speciesdescp6")
    private String speciesdescp6;
    @Basic
    @Column(name = "speciesdescp7")
    private String speciesdescp7;
    @Basic
    @Column(name = "speciesdescp8")
    private String speciesdescp8;
    @Basic
    @Column(name = "speciesdescp9")
    private String speciesdescp9;
    @Basic
    @Column(name = "abbreviationspecies")
    private String abbreviationspecies;
    @Basic
    @Column(name = "abbreviationspecies1")
    private String abbreviationspecies1;
    @Basic
    @Column(name = "abbreviationspecies2")
    private String abbreviationspecies2;
    @Basic
    @Column(name = "abbreviationspecies3")
    private String abbreviationspecies3;
    @Basic
    @Column(name = "abbreviationspecies4")
    private String abbreviationspecies4;
    @Basic
    @Column(name = "abbreviationspecies5")
    private String abbreviationspecies5;
    @Basic
    @Column(name = "abbreviationspecies6")
    private String abbreviationspecies6;
    @Basic
    @Column(name = "abbreviationspecies7")
    private String abbreviationspecies7;
    @Basic
    @Column(name = "abbreviationspecies8")
    private String abbreviationspecies8;
    @Basic
    @Column(name = "abbreviationspecies9")
    private String abbreviationspecies9;
    @Basic
    @Column(name = "spesifikasispecies")
    private String spesifikasispecies;
    @Basic
    @Column(name = "spesifikasispecies1")
    private String spesifikasispecies1;
    @Basic
    @Column(name = "spesifikasispecies2")
    private String spesifikasispecies2;
    @Basic
    @Column(name = "spesifikasispecies3")
    private String spesifikasispecies3;
    @Basic
    @Column(name = "spesifikasispecies4")
    private String spesifikasispecies4;
    @Basic
    @Column(name = "spesifikasispecies5")
    private String spesifikasispecies5;
    @Basic
    @Column(name = "spesifikasispecies6")
    private String spesifikasispecies6;
    @Basic
    @Column(name = "spesifikasispecies7")
    private String spesifikasispecies7;
    @Basic
    @Column(name = "spesifikasispecies8")
    private String spesifikasispecies8;
    @Basic
    @Column(name = "spesifikasispecies9")
    private String spesifikasispecies9;

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSpesifik() {
        return spesifik;
    }

    public void setSpesifik(String spesifik) {
        this.spesifik = spesifik;
    }

    public String getProductcode() {
        return productcode;
    }

    public void setProductcode(String productcode) {
        this.productcode = productcode;
    }

    public String getProductcode1() {
        return productcode1;
    }

    public void setProductcode1(String productcode1) {
        this.productcode1 = productcode1;
    }

    public String getProductcode2() {
        return productcode2;
    }

    public void setProductcode2(String productcode2) {
        this.productcode2 = productcode2;
    }

    public String getProductcode3() {
        return productcode3;
    }

    public void setProductcode3(String productcode3) {
        this.productcode3 = productcode3;
    }

    public String getProductcode4() {
        return productcode4;
    }

    public void setProductcode4(String productcode4) {
        this.productcode4 = productcode4;
    }

    public String getProductcode5() {
        return productcode5;
    }

    public void setProductcode5(String productcode5) {
        this.productcode5 = productcode5;
    }

    public String getProductcode6() {
        return productcode6;
    }

    public void setProductcode6(String productcode6) {
        this.productcode6 = productcode6;
    }

    public String getProductcode7() {
        return productcode7;
    }

    public void setProductcode7(String productcode7) {
        this.productcode7 = productcode7;
    }

    public String getProductcode8() {
        return productcode8;
    }

    public void setProductcode8(String productcode8) {
        this.productcode8 = productcode8;
    }

    public String getProductcode9() {
        return productcode9;
    }

    public void setProductcode9(String productcode9) {
        this.productcode9 = productcode9;
    }

    public String getProductdescp() {
        return productdescp;
    }

    public void setProductdescp(String productdescp) {
        this.productdescp = productdescp;
    }

    public String getProductdescp1() {
        return productdescp1;
    }

    public void setProductdescp1(String productdescp1) {
        this.productdescp1 = productdescp1;
    }

    public String getProductdescp2() {
        return productdescp2;
    }

    public void setProductdescp2(String productdescp2) {
        this.productdescp2 = productdescp2;
    }

    public String getProductdescp3() {
        return productdescp3;
    }

    public void setProductdescp3(String productdescp3) {
        this.productdescp3 = productdescp3;
    }

    public String getProductdescp4() {
        return productdescp4;
    }

    public void setProductdescp4(String productdescp4) {
        this.productdescp4 = productdescp4;
    }

    public String getProductdescp5() {
        return productdescp5;
    }

    public void setProductdescp5(String productdescp5) {
        this.productdescp5 = productdescp5;
    }

    public String getProductdescp6() {
        return productdescp6;
    }

    public void setProductdescp6(String productdescp6) {
        this.productdescp6 = productdescp6;
    }

    public String getProductdescp7() {
        return productdescp7;
    }

    public void setProductdescp7(String productdescp7) {
        this.productdescp7 = productdescp7;
    }

    public String getProductdescp8() {
        return productdescp8;
    }

    public void setProductdescp8(String productdescp8) {
        this.productdescp8 = productdescp8;
    }

    public String getProductdescp9() {
        return productdescp9;
    }

    public void setProductdescp9(String productdescp9) {
        this.productdescp9 = productdescp9;
    }

    public String getCoacode() {
        return coacode;
    }

    public void setCoacode(String coacode) {
        this.coacode = coacode;
    }

    public String getCoacode1() {
        return coacode1;
    }

    public void setCoacode1(String coacode1) {
        this.coacode1 = coacode1;
    }

    public String getCoacode2() {
        return coacode2;
    }

    public void setCoacode2(String coacode2) {
        this.coacode2 = coacode2;
    }

    public String getCoacode3() {
        return coacode3;
    }

    public void setCoacode3(String coacode3) {
        this.coacode3 = coacode3;
    }

    public String getCoacode4() {
        return coacode4;
    }

    public void setCoacode4(String coacode4) {
        this.coacode4 = coacode4;
    }

    public String getCoacode5() {
        return coacode5;
    }

    public void setCoacode5(String coacode5) {
        this.coacode5 = coacode5;
    }

    public String getCoacode6() {
        return coacode6;
    }

    public void setCoacode6(String coacode6) {
        this.coacode6 = coacode6;
    }

    public String getCoacode7() {
        return coacode7;
    }

    public void setCoacode7(String coacode7) {
        this.coacode7 = coacode7;
    }

    public String getCoacode8() {
        return coacode8;
    }

    public void setCoacode8(String coacode8) {
        this.coacode8 = coacode8;
    }

    public String getCoacode9() {
        return coacode9;
    }

    public void setCoacode9(String coacode9) {
        this.coacode9 = coacode9;
    }

    public String getCoadescp() {
        return coadescp;
    }

    public void setCoadescp(String coadescp) {
        this.coadescp = coadescp;
    }

    public String getCoadescp1() {
        return coadescp1;
    }

    public void setCoadescp1(String coadescp1) {
        this.coadescp1 = coadescp1;
    }

    public String getCoadescp2() {
        return coadescp2;
    }

    public void setCoadescp2(String coadescp2) {
        this.coadescp2 = coadescp2;
    }

    public String getCoadescp3() {
        return coadescp3;
    }

    public void setCoadescp3(String coadescp3) {
        this.coadescp3 = coadescp3;
    }

    public String getCoadescp4() {
        return coadescp4;
    }

    public void setCoadescp4(String coadescp4) {
        this.coadescp4 = coadescp4;
    }

    public String getCoadescp5() {
        return coadescp5;
    }

    public void setCoadescp5(String coadescp5) {
        this.coadescp5 = coadescp5;
    }

    public String getCoadescp6() {
        return coadescp6;
    }

    public void setCoadescp6(String coadescp6) {
        this.coadescp6 = coadescp6;
    }

    public String getCoadescp7() {
        return coadescp7;
    }

    public void setCoadescp7(String coadescp7) {
        this.coadescp7 = coadescp7;
    }

    public String getCoadescp8() {
        return coadescp8;
    }

    public void setCoadescp8(String coadescp8) {
        this.coadescp8 = coadescp8;
    }

    public String getCoadescp9() {
        return coadescp9;
    }

    public void setCoadescp9(String coadescp9) {
        this.coadescp9 = coadescp9;
    }

    public String getSpesifikproduct() {
        return spesifikproduct;
    }

    public void setSpesifikproduct(String spesifikproduct) {
        this.spesifikproduct = spesifikproduct;
    }

    public String getSpesifikproduct1() {
        return spesifikproduct1;
    }

    public void setSpesifikproduct1(String spesifikproduct1) {
        this.spesifikproduct1 = spesifikproduct1;
    }

    public String getSpesifikproduct2() {
        return spesifikproduct2;
    }

    public void setSpesifikproduct2(String spesifikproduct2) {
        this.spesifikproduct2 = spesifikproduct2;
    }

    public String getSpesifikproduct3() {
        return spesifikproduct3;
    }

    public void setSpesifikproduct3(String spesifikproduct3) {
        this.spesifikproduct3 = spesifikproduct3;
    }

    public String getSpesifikproduct4() {
        return spesifikproduct4;
    }

    public void setSpesifikproduct4(String spesifikproduct4) {
        this.spesifikproduct4 = spesifikproduct4;
    }

    public String getSpesifikproduct5() {
        return spesifikproduct5;
    }

    public void setSpesifikproduct5(String spesifikproduct5) {
        this.spesifikproduct5 = spesifikproduct5;
    }

    public String getSpesifikproduct6() {
        return spesifikproduct6;
    }

    public void setSpesifikproduct6(String spesifikproduct6) {
        this.spesifikproduct6 = spesifikproduct6;
    }

    public String getSpesifikproduct7() {
        return spesifikproduct7;
    }

    public void setSpesifikproduct7(String spesifikproduct7) {
        this.spesifikproduct7 = spesifikproduct7;
    }

    public String getSpesifikproduct8() {
        return spesifikproduct8;
    }

    public void setSpesifikproduct8(String spesifikproduct8) {
        this.spesifikproduct8 = spesifikproduct8;
    }

    public String getSpesifikproduct9() {
        return spesifikproduct9;
    }

    public void setSpesifikproduct9(String spesifikproduct9) {
        this.spesifikproduct9 = spesifikproduct9;
    }

    public String getClonecode() {
        return clonecode;
    }

    public void setClonecode(String clonecode) {
        this.clonecode = clonecode;
    }

    public String getClonecode1() {
        return clonecode1;
    }

    public void setClonecode1(String clonecode1) {
        this.clonecode1 = clonecode1;
    }

    public String getClonecode2() {
        return clonecode2;
    }

    public void setClonecode2(String clonecode2) {
        this.clonecode2 = clonecode2;
    }

    public String getClonecode3() {
        return clonecode3;
    }

    public void setClonecode3(String clonecode3) {
        this.clonecode3 = clonecode3;
    }

    public String getClonecode4() {
        return clonecode4;
    }

    public void setClonecode4(String clonecode4) {
        this.clonecode4 = clonecode4;
    }

    public String getClonecode5() {
        return clonecode5;
    }

    public void setClonecode5(String clonecode5) {
        this.clonecode5 = clonecode5;
    }

    public String getClonecode6() {
        return clonecode6;
    }

    public void setClonecode6(String clonecode6) {
        this.clonecode6 = clonecode6;
    }

    public String getClonecode7() {
        return clonecode7;
    }

    public void setClonecode7(String clonecode7) {
        this.clonecode7 = clonecode7;
    }

    public String getClonecode8() {
        return clonecode8;
    }

    public void setClonecode8(String clonecode8) {
        this.clonecode8 = clonecode8;
    }

    public String getClonecode9() {
        return clonecode9;
    }

    public void setClonecode9(String clonecode9) {
        this.clonecode9 = clonecode9;
    }

    public String getClonedescp() {
        return clonedescp;
    }

    public void setClonedescp(String clonedescp) {
        this.clonedescp = clonedescp;
    }

    public String getClonedescp1() {
        return clonedescp1;
    }

    public void setClonedescp1(String clonedescp1) {
        this.clonedescp1 = clonedescp1;
    }

    public String getClonedescp2() {
        return clonedescp2;
    }

    public void setClonedescp2(String clonedescp2) {
        this.clonedescp2 = clonedescp2;
    }

    public String getClonedescp3() {
        return clonedescp3;
    }

    public void setClonedescp3(String clonedescp3) {
        this.clonedescp3 = clonedescp3;
    }

    public String getClonedescp4() {
        return clonedescp4;
    }

    public void setClonedescp4(String clonedescp4) {
        this.clonedescp4 = clonedescp4;
    }

    public String getClonedescp5() {
        return clonedescp5;
    }

    public void setClonedescp5(String clonedescp5) {
        this.clonedescp5 = clonedescp5;
    }

    public String getClonedescp6() {
        return clonedescp6;
    }

    public void setClonedescp6(String clonedescp6) {
        this.clonedescp6 = clonedescp6;
    }

    public String getClonedescp7() {
        return clonedescp7;
    }

    public void setClonedescp7(String clonedescp7) {
        this.clonedescp7 = clonedescp7;
    }

    public String getClonedescp8() {
        return clonedescp8;
    }

    public void setClonedescp8(String clonedescp8) {
        this.clonedescp8 = clonedescp8;
    }

    public String getClonedescp9() {
        return clonedescp9;
    }

    public void setClonedescp9(String clonedescp9) {
        this.clonedescp9 = clonedescp9;
    }

    public String getAbbreviationclone() {
        return abbreviationclone;
    }

    public void setAbbreviationclone(String abbreviationclone) {
        this.abbreviationclone = abbreviationclone;
    }

    public String getAbbreviationclone1() {
        return abbreviationclone1;
    }

    public void setAbbreviationclone1(String abbreviationclone1) {
        this.abbreviationclone1 = abbreviationclone1;
    }

    public String getAbbreviationclone2() {
        return abbreviationclone2;
    }

    public void setAbbreviationclone2(String abbreviationclone2) {
        this.abbreviationclone2 = abbreviationclone2;
    }

    public String getAbbreviationclone3() {
        return abbreviationclone3;
    }

    public void setAbbreviationclone3(String abbreviationclone3) {
        this.abbreviationclone3 = abbreviationclone3;
    }

    public String getAbbreviationclone4() {
        return abbreviationclone4;
    }

    public void setAbbreviationclone4(String abbreviationclone4) {
        this.abbreviationclone4 = abbreviationclone4;
    }

    public String getAbbreviationclone5() {
        return abbreviationclone5;
    }

    public void setAbbreviationclone5(String abbreviationclone5) {
        this.abbreviationclone5 = abbreviationclone5;
    }

    public String getAbbreviationclone6() {
        return abbreviationclone6;
    }

    public void setAbbreviationclone6(String abbreviationclone6) {
        this.abbreviationclone6 = abbreviationclone6;
    }

    public String getAbbreviationclone7() {
        return abbreviationclone7;
    }

    public void setAbbreviationclone7(String abbreviationclone7) {
        this.abbreviationclone7 = abbreviationclone7;
    }

    public String getAbbreviationclone8() {
        return abbreviationclone8;
    }

    public void setAbbreviationclone8(String abbreviationclone8) {
        this.abbreviationclone8 = abbreviationclone8;
    }

    public String getAbbreviationclone9() {
        return abbreviationclone9;
    }

    public void setAbbreviationclone9(String abbreviationclone9) {
        this.abbreviationclone9 = abbreviationclone9;
    }

    public String getSpesifikclone() {
        return spesifikclone;
    }

    public void setSpesifikclone(String spesifikclone) {
        this.spesifikclone = spesifikclone;
    }

    public String getSpesifikclone1() {
        return spesifikclone1;
    }

    public void setSpesifikclone1(String spesifikclone1) {
        this.spesifikclone1 = spesifikclone1;
    }

    public String getSpesifikclone2() {
        return spesifikclone2;
    }

    public void setSpesifikclone2(String spesifikclone2) {
        this.spesifikclone2 = spesifikclone2;
    }

    public String getSpesifikclone3() {
        return spesifikclone3;
    }

    public void setSpesifikclone3(String spesifikclone3) {
        this.spesifikclone3 = spesifikclone3;
    }

    public String getSpesifikclone4() {
        return spesifikclone4;
    }

    public void setSpesifikclone4(String spesifikclone4) {
        this.spesifikclone4 = spesifikclone4;
    }

    public String getSpesifikclone5() {
        return spesifikclone5;
    }

    public void setSpesifikclone5(String spesifikclone5) {
        this.spesifikclone5 = spesifikclone5;
    }

    public String getSpesifikclone6() {
        return spesifikclone6;
    }

    public void setSpesifikclone6(String spesifikclone6) {
        this.spesifikclone6 = spesifikclone6;
    }

    public String getSpesifikclone7() {
        return spesifikclone7;
    }

    public void setSpesifikclone7(String spesifikclone7) {
        this.spesifikclone7 = spesifikclone7;
    }

    public String getSpesifikclone8() {
        return spesifikclone8;
    }

    public void setSpesifikclone8(String spesifikclone8) {
        this.spesifikclone8 = spesifikclone8;
    }

    public String getSpesifikclone9() {
        return spesifikclone9;
    }

    public void setSpesifikclone9(String spesifikclone9) {
        this.spesifikclone9 = spesifikclone9;
    }

    public String getSpeciescode() {
        return speciescode;
    }

    public void setSpeciescode(String speciescode) {
        this.speciescode = speciescode;
    }

    public String getSpeciescode1() {
        return speciescode1;
    }

    public void setSpeciescode1(String speciescode1) {
        this.speciescode1 = speciescode1;
    }

    public String getSpeciescode2() {
        return speciescode2;
    }

    public void setSpeciescode2(String speciescode2) {
        this.speciescode2 = speciescode2;
    }

    public String getSpeciescode3() {
        return speciescode3;
    }

    public void setSpeciescode3(String speciescode3) {
        this.speciescode3 = speciescode3;
    }

    public String getSpeciescode4() {
        return speciescode4;
    }

    public void setSpeciescode4(String speciescode4) {
        this.speciescode4 = speciescode4;
    }

    public String getSpeciescode5() {
        return speciescode5;
    }

    public void setSpeciescode5(String speciescode5) {
        this.speciescode5 = speciescode5;
    }

    public String getSpeciescode6() {
        return speciescode6;
    }

    public void setSpeciescode6(String speciescode6) {
        this.speciescode6 = speciescode6;
    }

    public String getSpeciescode7() {
        return speciescode7;
    }

    public void setSpeciescode7(String speciescode7) {
        this.speciescode7 = speciescode7;
    }

    public String getSpeciescode8() {
        return speciescode8;
    }

    public void setSpeciescode8(String speciescode8) {
        this.speciescode8 = speciescode8;
    }

    public String getSpeciescode9() {
        return speciescode9;
    }

    public void setSpeciescode9(String speciescode9) {
        this.speciescode9 = speciescode9;
    }

    public String getSpeciesdescp() {
        return speciesdescp;
    }

    public void setSpeciesdescp(String speciesdescp) {
        this.speciesdescp = speciesdescp;
    }

    public String getSpeciesdescp1() {
        return speciesdescp1;
    }

    public void setSpeciesdescp1(String speciesdescp1) {
        this.speciesdescp1 = speciesdescp1;
    }

    public String getSpeciesdescp2() {
        return speciesdescp2;
    }

    public void setSpeciesdescp2(String speciesdescp2) {
        this.speciesdescp2 = speciesdescp2;
    }

    public String getSpeciesdescp3() {
        return speciesdescp3;
    }

    public void setSpeciesdescp3(String speciesdescp3) {
        this.speciesdescp3 = speciesdescp3;
    }

    public String getSpeciesdescp4() {
        return speciesdescp4;
    }

    public void setSpeciesdescp4(String speciesdescp4) {
        this.speciesdescp4 = speciesdescp4;
    }

    public String getSpeciesdescp5() {
        return speciesdescp5;
    }

    public void setSpeciesdescp5(String speciesdescp5) {
        this.speciesdescp5 = speciesdescp5;
    }

    public String getSpeciesdescp6() {
        return speciesdescp6;
    }

    public void setSpeciesdescp6(String speciesdescp6) {
        this.speciesdescp6 = speciesdescp6;
    }

    public String getSpeciesdescp7() {
        return speciesdescp7;
    }

    public void setSpeciesdescp7(String speciesdescp7) {
        this.speciesdescp7 = speciesdescp7;
    }

    public String getSpeciesdescp8() {
        return speciesdescp8;
    }

    public void setSpeciesdescp8(String speciesdescp8) {
        this.speciesdescp8 = speciesdescp8;
    }

    public String getSpeciesdescp9() {
        return speciesdescp9;
    }

    public void setSpeciesdescp9(String speciesdescp9) {
        this.speciesdescp9 = speciesdescp9;
    }

    public String getAbbreviationspecies() {
        return abbreviationspecies;
    }

    public void setAbbreviationspecies(String abbreviationspecies) {
        this.abbreviationspecies = abbreviationspecies;
    }

    public String getAbbreviationspecies1() {
        return abbreviationspecies1;
    }

    public void setAbbreviationspecies1(String abbreviationspecies1) {
        this.abbreviationspecies1 = abbreviationspecies1;
    }

    public String getAbbreviationspecies2() {
        return abbreviationspecies2;
    }

    public void setAbbreviationspecies2(String abbreviationspecies2) {
        this.abbreviationspecies2 = abbreviationspecies2;
    }

    public String getAbbreviationspecies3() {
        return abbreviationspecies3;
    }

    public void setAbbreviationspecies3(String abbreviationspecies3) {
        this.abbreviationspecies3 = abbreviationspecies3;
    }

    public String getAbbreviationspecies4() {
        return abbreviationspecies4;
    }

    public void setAbbreviationspecies4(String abbreviationspecies4) {
        this.abbreviationspecies4 = abbreviationspecies4;
    }

    public String getAbbreviationspecies5() {
        return abbreviationspecies5;
    }

    public void setAbbreviationspecies5(String abbreviationspecies5) {
        this.abbreviationspecies5 = abbreviationspecies5;
    }

    public String getAbbreviationspecies6() {
        return abbreviationspecies6;
    }

    public void setAbbreviationspecies6(String abbreviationspecies6) {
        this.abbreviationspecies6 = abbreviationspecies6;
    }

    public String getAbbreviationspecies7() {
        return abbreviationspecies7;
    }

    public void setAbbreviationspecies7(String abbreviationspecies7) {
        this.abbreviationspecies7 = abbreviationspecies7;
    }

    public String getAbbreviationspecies8() {
        return abbreviationspecies8;
    }

    public void setAbbreviationspecies8(String abbreviationspecies8) {
        this.abbreviationspecies8 = abbreviationspecies8;
    }

    public String getAbbreviationspecies9() {
        return abbreviationspecies9;
    }

    public void setAbbreviationspecies9(String abbreviationspecies9) {
        this.abbreviationspecies9 = abbreviationspecies9;
    }

    public String getSpesifikasispecies() {
        return spesifikasispecies;
    }

    public void setSpesifikasispecies(String spesifikasispecies) {
        this.spesifikasispecies = spesifikasispecies;
    }

    public String getSpesifikasispecies1() {
        return spesifikasispecies1;
    }

    public void setSpesifikasispecies1(String spesifikasispecies1) {
        this.spesifikasispecies1 = spesifikasispecies1;
    }

    public String getSpesifikasispecies2() {
        return spesifikasispecies2;
    }

    public void setSpesifikasispecies2(String spesifikasispecies2) {
        this.spesifikasispecies2 = spesifikasispecies2;
    }

    public String getSpesifikasispecies3() {
        return spesifikasispecies3;
    }

    public void setSpesifikasispecies3(String spesifikasispecies3) {
        this.spesifikasispecies3 = spesifikasispecies3;
    }

    public String getSpesifikasispecies4() {
        return spesifikasispecies4;
    }

    public void setSpesifikasispecies4(String spesifikasispecies4) {
        this.spesifikasispecies4 = spesifikasispecies4;
    }

    public String getSpesifikasispecies5() {
        return spesifikasispecies5;
    }

    public void setSpesifikasispecies5(String spesifikasispecies5) {
        this.spesifikasispecies5 = spesifikasispecies5;
    }

    public String getSpesifikasispecies6() {
        return spesifikasispecies6;
    }

    public void setSpesifikasispecies6(String spesifikasispecies6) {
        this.spesifikasispecies6 = spesifikasispecies6;
    }

    public String getSpesifikasispecies7() {
        return spesifikasispecies7;
    }

    public void setSpesifikasispecies7(String spesifikasispecies7) {
        this.spesifikasispecies7 = spesifikasispecies7;
    }

    public String getSpesifikasispecies8() {
        return spesifikasispecies8;
    }

    public void setSpesifikasispecies8(String spesifikasispecies8) {
        this.spesifikasispecies8 = spesifikasispecies8;
    }

    public String getSpesifikasispecies9() {
        return spesifikasispecies9;
    }

    public void setSpesifikasispecies9(String spesifikasispecies9) {
        this.spesifikasispecies9 = spesifikasispecies9;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EnterpriseInfo that = (EnterpriseInfo) o;
        return Objects.equals(code, that.code) && Objects.equals(descp, that.descp) && Objects.equals(type, that.type) && Objects.equals(spesifik, that.spesifik) && Objects.equals(productcode, that.productcode) && Objects.equals(productcode1, that.productcode1) && Objects.equals(productcode2, that.productcode2) && Objects.equals(productcode3, that.productcode3) && Objects.equals(productcode4, that.productcode4) && Objects.equals(productcode5, that.productcode5) && Objects.equals(productcode6, that.productcode6) && Objects.equals(productcode7, that.productcode7) && Objects.equals(productcode8, that.productcode8) && Objects.equals(productcode9, that.productcode9) && Objects.equals(productdescp, that.productdescp) && Objects.equals(productdescp1, that.productdescp1) && Objects.equals(productdescp2, that.productdescp2) && Objects.equals(productdescp3, that.productdescp3) && Objects.equals(productdescp4, that.productdescp4) && Objects.equals(productdescp5, that.productdescp5) && Objects.equals(productdescp6, that.productdescp6) && Objects.equals(productdescp7, that.productdescp7) && Objects.equals(productdescp8, that.productdescp8) && Objects.equals(productdescp9, that.productdescp9) && Objects.equals(coacode, that.coacode) && Objects.equals(coacode1, that.coacode1) && Objects.equals(coacode2, that.coacode2) && Objects.equals(coacode3, that.coacode3) && Objects.equals(coacode4, that.coacode4) && Objects.equals(coacode5, that.coacode5) && Objects.equals(coacode6, that.coacode6) && Objects.equals(coacode7, that.coacode7) && Objects.equals(coacode8, that.coacode8) && Objects.equals(coacode9, that.coacode9) && Objects.equals(coadescp, that.coadescp) && Objects.equals(coadescp1, that.coadescp1) && Objects.equals(coadescp2, that.coadescp2) && Objects.equals(coadescp3, that.coadescp3) && Objects.equals(coadescp4, that.coadescp4) && Objects.equals(coadescp5, that.coadescp5) && Objects.equals(coadescp6, that.coadescp6) && Objects.equals(coadescp7, that.coadescp7) && Objects.equals(coadescp8, that.coadescp8) && Objects.equals(coadescp9, that.coadescp9) && Objects.equals(spesifikproduct, that.spesifikproduct) && Objects.equals(spesifikproduct1, that.spesifikproduct1) && Objects.equals(spesifikproduct2, that.spesifikproduct2) && Objects.equals(spesifikproduct3, that.spesifikproduct3) && Objects.equals(spesifikproduct4, that.spesifikproduct4) && Objects.equals(spesifikproduct5, that.spesifikproduct5) && Objects.equals(spesifikproduct6, that.spesifikproduct6) && Objects.equals(spesifikproduct7, that.spesifikproduct7) && Objects.equals(spesifikproduct8, that.spesifikproduct8) && Objects.equals(spesifikproduct9, that.spesifikproduct9) && Objects.equals(clonecode, that.clonecode) && Objects.equals(clonecode1, that.clonecode1) && Objects.equals(clonecode2, that.clonecode2) && Objects.equals(clonecode3, that.clonecode3) && Objects.equals(clonecode4, that.clonecode4) && Objects.equals(clonecode5, that.clonecode5) && Objects.equals(clonecode6, that.clonecode6) && Objects.equals(clonecode7, that.clonecode7) && Objects.equals(clonecode8, that.clonecode8) && Objects.equals(clonecode9, that.clonecode9) && Objects.equals(clonedescp, that.clonedescp) && Objects.equals(clonedescp1, that.clonedescp1) && Objects.equals(clonedescp2, that.clonedescp2) && Objects.equals(clonedescp3, that.clonedescp3) && Objects.equals(clonedescp4, that.clonedescp4) && Objects.equals(clonedescp5, that.clonedescp5) && Objects.equals(clonedescp6, that.clonedescp6) && Objects.equals(clonedescp7, that.clonedescp7) && Objects.equals(clonedescp8, that.clonedescp8) && Objects.equals(clonedescp9, that.clonedescp9) && Objects.equals(abbreviationclone, that.abbreviationclone) && Objects.equals(abbreviationclone1, that.abbreviationclone1) && Objects.equals(abbreviationclone2, that.abbreviationclone2) && Objects.equals(abbreviationclone3, that.abbreviationclone3) && Objects.equals(abbreviationclone4, that.abbreviationclone4) && Objects.equals(abbreviationclone5, that.abbreviationclone5) && Objects.equals(abbreviationclone6, that.abbreviationclone6) && Objects.equals(abbreviationclone7, that.abbreviationclone7) && Objects.equals(abbreviationclone8, that.abbreviationclone8) && Objects.equals(abbreviationclone9, that.abbreviationclone9) && Objects.equals(spesifikclone, that.spesifikclone) && Objects.equals(spesifikclone1, that.spesifikclone1) && Objects.equals(spesifikclone2, that.spesifikclone2) && Objects.equals(spesifikclone3, that.spesifikclone3) && Objects.equals(spesifikclone4, that.spesifikclone4) && Objects.equals(spesifikclone5, that.spesifikclone5) && Objects.equals(spesifikclone6, that.spesifikclone6) && Objects.equals(spesifikclone7, that.spesifikclone7) && Objects.equals(spesifikclone8, that.spesifikclone8) && Objects.equals(spesifikclone9, that.spesifikclone9) && Objects.equals(speciescode, that.speciescode) && Objects.equals(speciescode1, that.speciescode1) && Objects.equals(speciescode2, that.speciescode2) && Objects.equals(speciescode3, that.speciescode3) && Objects.equals(speciescode4, that.speciescode4) && Objects.equals(speciescode5, that.speciescode5) && Objects.equals(speciescode6, that.speciescode6) && Objects.equals(speciescode7, that.speciescode7) && Objects.equals(speciescode8, that.speciescode8) && Objects.equals(speciescode9, that.speciescode9) && Objects.equals(speciesdescp, that.speciesdescp) && Objects.equals(speciesdescp1, that.speciesdescp1) && Objects.equals(speciesdescp2, that.speciesdescp2) && Objects.equals(speciesdescp3, that.speciesdescp3) && Objects.equals(speciesdescp4, that.speciesdescp4) && Objects.equals(speciesdescp5, that.speciesdescp5) && Objects.equals(speciesdescp6, that.speciesdescp6) && Objects.equals(speciesdescp7, that.speciesdescp7) && Objects.equals(speciesdescp8, that.speciesdescp8) && Objects.equals(speciesdescp9, that.speciesdescp9) && Objects.equals(abbreviationspecies, that.abbreviationspecies) && Objects.equals(abbreviationspecies1, that.abbreviationspecies1) && Objects.equals(abbreviationspecies2, that.abbreviationspecies2) && Objects.equals(abbreviationspecies3, that.abbreviationspecies3) && Objects.equals(abbreviationspecies4, that.abbreviationspecies4) && Objects.equals(abbreviationspecies5, that.abbreviationspecies5) && Objects.equals(abbreviationspecies6, that.abbreviationspecies6) && Objects.equals(abbreviationspecies7, that.abbreviationspecies7) && Objects.equals(abbreviationspecies8, that.abbreviationspecies8) && Objects.equals(abbreviationspecies9, that.abbreviationspecies9) && Objects.equals(spesifikasispecies, that.spesifikasispecies) && Objects.equals(spesifikasispecies1, that.spesifikasispecies1) && Objects.equals(spesifikasispecies2, that.spesifikasispecies2) && Objects.equals(spesifikasispecies3, that.spesifikasispecies3) && Objects.equals(spesifikasispecies4, that.spesifikasispecies4) && Objects.equals(spesifikasispecies5, that.spesifikasispecies5) && Objects.equals(spesifikasispecies6, that.spesifikasispecies6) && Objects.equals(spesifikasispecies7, that.spesifikasispecies7) && Objects.equals(spesifikasispecies8, that.spesifikasispecies8) && Objects.equals(spesifikasispecies9, that.spesifikasispecies9);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, descp, type, spesifik, productcode, productcode1, productcode2, productcode3, productcode4, productcode5, productcode6, productcode7, productcode8, productcode9, productdescp, productdescp1, productdescp2, productdescp3, productdescp4, productdescp5, productdescp6, productdescp7, productdescp8, productdescp9, coacode, coacode1, coacode2, coacode3, coacode4, coacode5, coacode6, coacode7, coacode8, coacode9, coadescp, coadescp1, coadescp2, coadescp3, coadescp4, coadescp5, coadescp6, coadescp7, coadescp8, coadescp9, spesifikproduct, spesifikproduct1, spesifikproduct2, spesifikproduct3, spesifikproduct4, spesifikproduct5, spesifikproduct6, spesifikproduct7, spesifikproduct8, spesifikproduct9, clonecode, clonecode1, clonecode2, clonecode3, clonecode4, clonecode5, clonecode6, clonecode7, clonecode8, clonecode9, clonedescp, clonedescp1, clonedescp2, clonedescp3, clonedescp4, clonedescp5, clonedescp6, clonedescp7, clonedescp8, clonedescp9, abbreviationclone, abbreviationclone1, abbreviationclone2, abbreviationclone3, abbreviationclone4, abbreviationclone5, abbreviationclone6, abbreviationclone7, abbreviationclone8, abbreviationclone9, spesifikclone, spesifikclone1, spesifikclone2, spesifikclone3, spesifikclone4, spesifikclone5, spesifikclone6, spesifikclone7, spesifikclone8, spesifikclone9, speciescode, speciescode1, speciescode2, speciescode3, speciescode4, speciescode5, speciescode6, speciescode7, speciescode8, speciescode9, speciesdescp, speciesdescp1, speciesdescp2, speciesdescp3, speciesdescp4, speciesdescp5, speciesdescp6, speciesdescp7, speciesdescp8, speciesdescp9, abbreviationspecies, abbreviationspecies1, abbreviationspecies2, abbreviationspecies3, abbreviationspecies4, abbreviationspecies5, abbreviationspecies6, abbreviationspecies7, abbreviationspecies8, abbreviationspecies9, spesifikasispecies, spesifikasispecies1, spesifikasispecies2, spesifikasispecies3, spesifikasispecies4, spesifikasispecies5, spesifikasispecies6, spesifikasispecies7, spesifikasispecies8, spesifikasispecies9);
    }
}
