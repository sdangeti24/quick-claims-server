package com.allstate.quickclaimsserver.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.security.Identity;
import java.sql.Date;
import java.util.Objects;

@Entity
public class Claim {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Integer claimnum;
    private Double amount;
    private Date date;
    private String policynum;
    private String status;

    @Override
    public String toString() {
        return "Claim{" +
                "claimnum=" + claimnum +
                ", amount=" + amount +
                ", date=" + date +
                ", policynum='" + policynum + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Claim claim = (Claim) o;
        return Objects.equals(claimnum, claim.claimnum) && Objects.equals(amount, claim.amount) && Objects.equals(date, claim.date) && Objects.equals(policynum, claim.policynum) && Objects.equals(status, claim.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(claimnum, amount, date, policynum, status);
    }

    public Claim() {
    }

    public Claim(Integer claimnum, Double amount, Date date, String policynum, String status) {
        this.claimnum = claimnum;
        this.amount = amount;
        this.date = date;
        this.policynum = policynum;
        this.status = status;
    }

    public Integer getClaimnum() {
        return claimnum;
    }

    public void setClaimnum(Integer claimnum) {
        this.claimnum = claimnum;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getPolicynum() {
        return policynum;
    }

    public void setPolicynum(String policynum) {
        this.policynum = policynum;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
