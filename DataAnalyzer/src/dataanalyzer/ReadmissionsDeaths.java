/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataanalyzer;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jimstewart
 */
@Entity
@Table(name = "ReadmissionsDeaths")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ReadmissionsDeaths.findAll", query = "SELECT r FROM ReadmissionsDeaths r"),
    @NamedQuery(name = "ReadmissionsDeaths.findByProviderId", query = "SELECT r FROM ReadmissionsDeaths r WHERE r.providerId = :providerId"),
    @NamedQuery(name = "ReadmissionsDeaths.findByHospitalName", query = "SELECT r FROM ReadmissionsDeaths r WHERE r.hospitalName = :hospitalName"),
    @NamedQuery(name = "ReadmissionsDeaths.findByAddress", query = "SELECT r FROM ReadmissionsDeaths r WHERE r.address = :address"),
    @NamedQuery(name = "ReadmissionsDeaths.findByCity", query = "SELECT r FROM ReadmissionsDeaths r WHERE r.city = :city"),
    @NamedQuery(name = "ReadmissionsDeaths.findByState", query = "SELECT r FROM ReadmissionsDeaths r WHERE r.state = :state"),
    @NamedQuery(name = "ReadmissionsDeaths.findByZipCode", query = "SELECT r FROM ReadmissionsDeaths r WHERE r.zipCode = :zipCode"),
    @NamedQuery(name = "ReadmissionsDeaths.findByCountyName", query = "SELECT r FROM ReadmissionsDeaths r WHERE r.countyName = :countyName"),
    @NamedQuery(name = "ReadmissionsDeaths.findByPhoneNumber", query = "SELECT r FROM ReadmissionsDeaths r WHERE r.phoneNumber = :phoneNumber"),
    @NamedQuery(name = "ReadmissionsDeaths.findByMeasureName", query = "SELECT r FROM ReadmissionsDeaths r WHERE r.measureName = :measureName"),
    @NamedQuery(name = "ReadmissionsDeaths.findByMeasureId", query = "SELECT r FROM ReadmissionsDeaths r WHERE r.measureId = :measureId"),
    @NamedQuery(name = "ReadmissionsDeaths.findByComparedToNational", query = "SELECT r FROM ReadmissionsDeaths r WHERE r.comparedToNational = :comparedToNational"),
    @NamedQuery(name = "ReadmissionsDeaths.findByScore", query = "SELECT r FROM ReadmissionsDeaths r WHERE r.score = :score"),
    @NamedQuery(name = "ReadmissionsDeaths.findByLowerEstimate", query = "SELECT r FROM ReadmissionsDeaths r WHERE r.lowerEstimate = :lowerEstimate"),
    @NamedQuery(name = "ReadmissionsDeaths.findByHigherEstimate", query = "SELECT r FROM ReadmissionsDeaths r WHERE r.higherEstimate = :higherEstimate"),
    @NamedQuery(name = "ReadmissionsDeaths.findById", query = "SELECT r FROM ReadmissionsDeaths r WHERE r.id = :id")})
public class ReadmissionsDeaths implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "ProviderId")
    private Integer providerId;
    @Column(name = "HospitalName")
    private String hospitalName;
    @Column(name = "Address")
    private String address;
    @Column(name = "City")
    private String city;
    @Column(name = "State")
    private String state;
    @Column(name = "ZipCode")
    private String zipCode;
    @Column(name = "CountyName")
    private String countyName;
    @Column(name = "PhoneNumber")
    private String phoneNumber;
    @Column(name = "MeasureName")
    private String measureName;
    @Column(name = "MeasureId")
    private String measureId;
    @Column(name = "ComparedToNational")
    private String comparedToNational;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "Score")
    private BigDecimal score;
    @Column(name = "LowerEstimate")
    private BigDecimal lowerEstimate;
    @Column(name = "HigherEstimate")
    private BigDecimal higherEstimate;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;

    public ReadmissionsDeaths() {
    }

    public ReadmissionsDeaths(Integer id) {
        this.id = id;
    }

    public Integer getProviderId() {
        return providerId;
    }

    public void setProviderId(Integer providerId) {
        this.providerId = providerId;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
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

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getMeasureName() {
        return measureName;
    }

    public void setMeasureName(String measureName) {
        this.measureName = measureName;
    }

    public String getMeasureId() {
        return measureId;
    }

    public void setMeasureId(String measureId) {
        this.measureId = measureId;
    }

    public String getComparedToNational() {
        return comparedToNational;
    }

    public void setComparedToNational(String comparedToNational) {
        this.comparedToNational = comparedToNational;
    }

    public BigDecimal getScore() {
        return score;
    }

    public void setScore(BigDecimal score) {
        this.score = score;
    }

    public BigDecimal getLowerEstimate() {
        return lowerEstimate;
    }

    public void setLowerEstimate(BigDecimal lowerEstimate) {
        this.lowerEstimate = lowerEstimate;
    }

    public BigDecimal getHigherEstimate() {
        return higherEstimate;
    }

    public void setHigherEstimate(BigDecimal higherEstimate) {
        this.higherEstimate = higherEstimate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ReadmissionsDeaths)) {
            return false;
        }
        ReadmissionsDeaths other = (ReadmissionsDeaths) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "dataanalyzer.ReadmissionsDeaths[ id=" + id + " ]";
    }
    
}
