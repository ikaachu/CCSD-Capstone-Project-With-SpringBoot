package com.capstone.ccsd.customer;

import com.capstone.ccsd.cart.Cart;
import com.capstone.ccsd.cust_update.CustUpdate;
import com.capstone.ccsd.review.Review;
import com.capstone.ccsd.seller.Seller;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CustId")
    private Integer custId;
    @Column(name = "CustPassword")
    private String custPassword;
    @Column(name = "CustFirstName")
    private String custFirstName;
    @Column(name = "CustLastName")
    private String custLastName;
    @Column(name = "CustEmail")
    private String custEmail;
    @Column(name = "CustAddress")
    private String custAddress;
    @Column(name = "CustPhoneNum")
    private String custPhoneNum;
    @OneToMany(mappedBy = "customer")
    private List<Cart> carts;
    @OneToMany(mappedBy = "customer")
    private List<CustUpdate> custUpdates;
    @OneToMany(mappedBy = "customer")
    private List<Review> reviews;

    public Integer getCustId() {
        return custId;
    }

    public void setCustId(Integer custId) {
        this.custId = custId;
    }

    public String getCustPassword() {
        return custPassword;
    }

    public void setCustPassword(String custPassword) {
        this.custPassword = custPassword;
    }

    public String getCustFirstName() {
        return custFirstName;
    }

    public void setCustFirstName(String custFirstName) {
        this.custFirstName = custFirstName;
    }

    public String getCustLastName() {
        return custLastName;
    }

    public void setCustLastName(String custLastName) {
        this.custLastName = custLastName;
    }

    public String getCustEmail() {
        return custEmail;
    }

    public void setCustEmail(String custEmail) {
        this.custEmail = custEmail;
    }

    public String getCustAddress() {
        return custAddress;
    }

    public void setCustAddress(String custAddress) {
        this.custAddress = custAddress;
    }

    public String getCustPhoneNum() {
        return custPhoneNum;
    }

    public void setCustPhoneNum(String custPhoneNum) {
        this.custPhoneNum = custPhoneNum;
    }

    public List<Cart> getCarts() {
        return carts;
    }

    public void setCarts(List<Cart> carts) {
        this.carts = carts;
    }

    public List<CustUpdate> getCustUpdates() {
        return custUpdates;
    }

    public void setCustUpdates(List<CustUpdate> custUpdates) {
        this.custUpdates = custUpdates;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }
}
