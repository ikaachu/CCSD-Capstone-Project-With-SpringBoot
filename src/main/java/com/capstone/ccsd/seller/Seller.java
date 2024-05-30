package com.capstone.ccsd.seller;

import com.capstone.ccsd.customer.Customer;
import com.capstone.ccsd.dessert.Dessert;
import com.capstone.ccsd.order.Order;
import com.capstone.ccsd.review.Review;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Seller")
public class Seller {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SellerId")
    private Integer sellerId;
    @Column(name = "SellerPassword")
    private String sellerPassword;
    @Column(name = "SellerFirstName")
    private String sellerFirstName;
    @Column(name = "SellerEmail")
    private String sellerEmail;
    @Column(name = "SellerAddress")
    private String sellerAddress;
    @OneToMany(mappedBy = "seller")
    private List<Order> orders;
    @OneToMany(mappedBy = "seller")
    private List<Review> reviews;
    @OneToMany(mappedBy = "seller")
    private List<Dessert> desserts;

    public Integer getSellerId() {
        return sellerId;
    }

    public void setSellerId(Integer sellerId) {
        this.sellerId = sellerId;
    }

    public String getSellerPassword() {
        return sellerPassword;
    }

    public void setSellerPassword(String sellerPassword) {
        this.sellerPassword = sellerPassword;
    }

    public String getSellerFirstName() {
        return sellerFirstName;
    }

    public void setSellerFirstName(String sellerFirstName) {
        this.sellerFirstName = sellerFirstName;
    }

    public String getSellerEmail() {
        return sellerEmail;
    }

    public void setSellerEmail(String sellerEmail) {
        this.sellerEmail = sellerEmail;
    }

    public String getSellerAddress() {
        return sellerAddress;
    }

    public void setSellerAddress(String sellerAddress) {
        this.sellerAddress = sellerAddress;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

    public List<Dessert> getDesserts() {
        return desserts;
    }

    public void setDesserts(List<Dessert> desserts) {
        this.desserts = desserts;
    }
}
