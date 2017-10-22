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
@Table(name = "ipps")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ipps.findAll", query = "SELECT i FROM Ipps i"),
    @NamedQuery(name = "Ipps.findByDrgDefinition", query = "SELECT i FROM Ipps i WHERE i.drgDefinition = :drgDefinition"),
    @NamedQuery(name = "Ipps.findByProviderId", query = "SELECT i FROM Ipps i WHERE i.providerId = :providerId"),
    @NamedQuery(name = "Ipps.findByProviderName", query = "SELECT i FROM Ipps i WHERE i.providerName = :providerName"),
    @NamedQuery(name = "Ipps.findByProviderAddress", query = "SELECT i FROM Ipps i WHERE i.providerAddress = :providerAddress"),
    @NamedQuery(name = "Ipps.findByProviderCity", query = "SELECT i FROM Ipps i WHERE i.providerCity = :providerCity"),
    @NamedQuery(name = "Ipps.findByProviderState", query = "SELECT i FROM Ipps i WHERE i.providerState = :providerState"),
    @NamedQuery(name = "Ipps.findByProviderZip", query = "SELECT i FROM Ipps i WHERE i.providerZip = :providerZip"),
    @NamedQuery(name = "Ipps.findByHospitalRegion", query = "SELECT i FROM Ipps i WHERE i.hospitalRegion = :hospitalRegion"),
    @NamedQuery(name = "Ipps.findByTotalDischarges", query = "SELECT i FROM Ipps i WHERE i.totalDischarges = :totalDischarges"),
    @NamedQuery(name = "Ipps.findByAverageCoveredCharges", query = "SELECT i FROM Ipps i WHERE i.averageCoveredCharges = :averageCoveredCharges"),
    @NamedQuery(name = "Ipps.findByAverageTotalPayments", query = "SELECT i FROM Ipps i WHERE i.averageTotalPayments = :averageTotalPayments"),
    @NamedQuery(name = "Ipps.findByAverageMedicarePayments", query = "SELECT i FROM Ipps i WHERE i.averageMedicarePayments = :averageMedicarePayments"),
    @NamedQuery(name = "Ipps.findById", query = "SELECT i FROM Ipps i WHERE i.id = :id")})
public class Ipps implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "DrgDefinition")
    private String drgDefinition;
    @Column(name = "ProviderId")
    private Integer providerId;
    @Column(name = "ProviderName")
    private String providerName;
    @Column(name = "ProviderAddress")
    private String providerAddress;
    @Column(name = "ProviderCity")
    private String providerCity;
    @Column(name = "ProviderState")
    private String providerState;
    @Column(name = "ProviderZip")
    private String providerZip;
    @Column(name = "HospitalRegion")
    private String hospitalRegion;
    @Column(name = "TotalDischarges")
    private Short totalDischarges;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "AverageCoveredCharges")
    private BigDecimal averageCoveredCharges;
    @Column(name = "AverageTotalPayments")
    private BigDecimal averageTotalPayments;
    @Column(name = "AverageMedicarePayments")
    private BigDecimal averageMedicarePayments;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;

    public Ipps() {
    }

    public Ipps(Integer id) {
        this.id = id;
    }

    public String getDrgDefinition() {
        return drgDefinition;
    }

    public void setDrgDefinition(String drgDefinition) {
        this.drgDefinition = drgDefinition;
    }

    public Integer getProviderId() {
        return providerId;
    }

    public void setProviderId(Integer providerId) {
        this.providerId = providerId;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public String getProviderAddress() {
        return providerAddress;
    }

    public void setProviderAddress(String providerAddress) {
        this.providerAddress = providerAddress;
    }

    public String getProviderCity() {
        return providerCity;
    }

    public void setProviderCity(String providerCity) {
        this.providerCity = providerCity;
    }

    public String getProviderState() {
        return providerState;
    }

    public void setProviderState(String providerState) {
        this.providerState = providerState;
    }

    public String getProviderZip() {
        return providerZip;
    }

    public void setProviderZip(String providerZip) {
        this.providerZip = providerZip;
    }

    public String getHospitalRegion() {
        return hospitalRegion;
    }

    public void setHospitalRegion(String hospitalRegion) {
        this.hospitalRegion = hospitalRegion;
    }

    public Short getTotalDischarges() {
        return totalDischarges;
    }

    public void setTotalDischarges(Short totalDischarges) {
        this.totalDischarges = totalDischarges;
    }

    public BigDecimal getAverageCoveredCharges() {
        return averageCoveredCharges;
    }

    public void setAverageCoveredCharges(BigDecimal averageCoveredCharges) {
        this.averageCoveredCharges = averageCoveredCharges;
    }

    public BigDecimal getAverageTotalPayments() {
        return averageTotalPayments;
    }

    public void setAverageTotalPayments(BigDecimal averageTotalPayments) {
        this.averageTotalPayments = averageTotalPayments;
    }

    public BigDecimal getAverageMedicarePayments() {
        return averageMedicarePayments;
    }

    public void setAverageMedicarePayments(BigDecimal averageMedicarePayments) {
        this.averageMedicarePayments = averageMedicarePayments;
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
        if (!(object instanceof Ipps)) {
            return false;
        }
        Ipps other = (Ipps) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "dataanalyzer.Ipps[ id=" + id + " ]";
    }
    
}
