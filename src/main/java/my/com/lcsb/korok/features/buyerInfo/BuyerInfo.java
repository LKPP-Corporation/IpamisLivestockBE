package my.com.lcsb.korok.features.buyerInfo;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "buyer_info", schema = "ipamis_mdsb", catalog = "")
public class BuyerInfo {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "code")
    private String code;
  
    @Basic
    @Column(name = "companyname")
    private String companyname;
    @Basic
    @Column(name = "coregister")
    private String coregister;
    @Basic
    @Column(name = "bumiputra")
    private String bumiputra;
    @Basic
    @Column(name = "porla")
    private String porla;
    @Basic
    @Column(name = "mill")
    private String mill;
    @Basic
    @Column(name = "coa")
    private String coa;
    @Basic
    @Column(name = "coadescp")
    private String coadescp;
    @Basic
    @Column(name = "person")
    private String person;
    @Basic
    @Column(name = "title")
    private String title;
    @Basic
    @Column(name = "position")
    private String position;
    @Basic
    @Column(name = "hp")
    private String hp;
    @Basic
    @Column(name = "address")
    private String address;
    @Basic
    @Column(name = "city")
    private String city;
    @Basic
    @Column(name = "state")
    private String state;
    @Basic
    @Column(name = "postcode")
    private String postcode;
    @Basic
    @Column(name = "country")
    private String country;
    @Basic
    @Column(name = "phone")
    private String phone;
    @Basic
    @Column(name = "fax")
    private String fax;
    @Basic
    @Column(name = "email")
    private String email;
    @Basic
    @Column(name = "url")
    private String url;
    @Basic
    @Column(name = "remarks")
    private String remarks;
    @Basic
    @Column(name = "gstid")
    private String gstid;
    @Basic
    @Column(name = "contractorcode")
    private String contractorcode;
    @Basic
    @Column(name = "date_verification")
    private String dateVerification;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    public String getCoregister() {
        return coregister;
    }

    public void setCoregister(String coregister) {
        this.coregister = coregister;
    }

    public String getBumiputra() {
        return bumiputra;
    }

    public void setBumiputra(String bumiputra) {
        this.bumiputra = bumiputra;
    }

    public String getPorla() {
        return porla;
    }

    public void setPorla(String porla) {
        this.porla = porla;
    }

    public String getMill() {
        return mill;
    }

    public void setMill(String mill) {
        this.mill = mill;
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

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getHp() {
        return hp;
    }

    public void setHp(String hp) {
        this.hp = hp;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }
 
    public void setEmail(String email) {
        this.email = email;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getGstid() {
        return gstid;
    }

    public void setGstid(String gstid) {
        this.gstid = gstid;
    }

    public String getContractorcode() {
        return contractorcode;
    }

    public void setContractorcode(String contractorcode) {
        this.contractorcode = contractorcode;
    }

    public String getDateVerification() {
        return dateVerification;
    }

    public void setDateVerification(String dateVerification) {
        this.dateVerification = dateVerification;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BuyerInfo buyerInfo = (BuyerInfo) o;
        return Objects.equals(code, buyerInfo.code) && Objects.equals(companyname, buyerInfo.companyname) && Objects.equals(coregister, buyerInfo.coregister) && Objects.equals(bumiputra, buyerInfo.bumiputra) && Objects.equals(porla, buyerInfo.porla) && Objects.equals(mill, buyerInfo.mill) && Objects.equals(coa, buyerInfo.coa) && Objects.equals(coadescp, buyerInfo.coadescp) && Objects.equals(person, buyerInfo.person) && Objects.equals(title, buyerInfo.title) && Objects.equals(position, buyerInfo.position) && Objects.equals(hp, buyerInfo.hp) && Objects.equals(address, buyerInfo.address) && Objects.equals(city, buyerInfo.city) && Objects.equals(state, buyerInfo.state) && Objects.equals(postcode, buyerInfo.postcode) && Objects.equals(country, buyerInfo.country) && Objects.equals(phone, buyerInfo.phone) && Objects.equals(fax, buyerInfo.fax) && Objects.equals(email, buyerInfo.email) && Objects.equals(url, buyerInfo.url) && Objects.equals(remarks, buyerInfo.remarks) && Objects.equals(gstid, buyerInfo.gstid) && Objects.equals(contractorcode, buyerInfo.contractorcode) && Objects.equals(dateVerification, buyerInfo.dateVerification);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, companyname, coregister, bumiputra, porla, mill, coa, coadescp, person, title, position, hp, address, city, state, postcode, country, phone, fax, email, url, remarks, gstid, contractorcode, dateVerification);
    }
}
