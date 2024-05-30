package com.capstone.ccsd.cust_update;

import com.capstone.ccsd.customer.Customer;
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
@Table(name = "CustUpdate")
public class CustUpdate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CustUpdateId")
    private Integer custUpdateId;
    @Column(name = "CustUpdatePassword")
    private String custUpdatePassword;
    @Column(name = "CustUpdateFirstName")
    private String custUpdateFirstName;
    @Column(name = "CustUpdateLastName")
    private String custUpdateLastName;
    @Column(name = "CustUpdateEmail")
    private String custUpdateEmail;
    @Column(name = "CustUpdateAddress")
    private String custUpdateAddress;
    @Column(name = "CustUpdatePhoneNum")
    private String custUpdatePhoneNum;
    @ManyToOne
    @JoinColumn(name = "customer_CustId")
    private Customer customer;
//    @OneToMany(mappedBy = "Customer", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    private List<Customer> customer_CustId;


    public Integer getCustUpdateId() {
        return custUpdateId;
    }

    public void setCustUpdateId(Integer custUpdateId) {
        this.custUpdateId = custUpdateId;
    }

    public String getCustUpdatePassword() {
        return custUpdatePassword;
    }

    public void setCustUpdatePassword(String custUpdatePassword) {
        this.custUpdatePassword = custUpdatePassword;
    }

    public String getCustUpdateFirstName() {
        return custUpdateFirstName;
    }

    public void setCustUpdateFirstName(String custUpdateFirstName) {
        this.custUpdateFirstName = custUpdateFirstName;
    }

    public String getCustUpdateLastName() {
        return custUpdateLastName;
    }

    public void setCustUpdateLastName(String custUpdateLastName) {
        this.custUpdateLastName = custUpdateLastName;
    }

    public String getCustUpdateEmail() {
        return custUpdateEmail;
    }

    public void setCustUpdateEmail(String custUpdateEmail) {
        this.custUpdateEmail = custUpdateEmail;
    }

    public String getCustUpdateAddress() {
        return custUpdateAddress;
    }

    public void setCustUpdateAddress(String custUpdateAddress) {
        this.custUpdateAddress = custUpdateAddress;
    }

    public String getCustUpdatePhoneNum() {
        return custUpdatePhoneNum;
    }

    public void setCustUpdatePhoneNum(String custUpdatePhoneNum) {
        this.custUpdatePhoneNum = custUpdatePhoneNum;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
