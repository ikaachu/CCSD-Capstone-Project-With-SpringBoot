package com.capstone.ccsd.order;

import com.capstone.ccsd.category.Category;
import com.capstone.ccsd.dessert.Dessert;
import com.capstone.ccsd.payment.Payment;
import com.capstone.ccsd.seller.Seller;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Order")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "OrderId")
    private Integer orderId;
    @Column(name = "OrderQuantity")
    private Integer orderName;
    @Column(name = "OrderTotalPrice")
    private Double orderTotalPrice;
    @Column(name = "OrderDate")
    private LocalDate orderDate;
    @Column(name = "OrderTime")
    private LocalDateTime orderTime;
    @Column(name = "OrderStatus")
    private String orderStatus;
    @OneToMany(mappedBy = "order")
    private List<Payment> payments;
    @ManyToOne
    @JoinColumn(name = "seller_SellerId")
    private Seller seller;
    @ManyToMany(mappedBy = "orders")
    private Set<Dessert> desserts;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getOrderName() {
        return orderName;
    }

    public void setOrderName(Integer orderName) {
        this.orderName = orderName;
    }

    public Double getOrderTotalPrice() {
        return orderTotalPrice;
    }

    public void setOrderTotalPrice(Double orderTotalPrice) {
        this.orderTotalPrice = orderTotalPrice;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public LocalDateTime getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(LocalDateTime orderTime) {
        this.orderTime = orderTime;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public List<Payment> getPayments() {
        return payments;
    }

    public void setPayments(List<Payment> payments) {
        this.payments = payments;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public Set<Dessert> getDesserts() {
        return desserts;
    }

    public void setDesserts(Set<Dessert> desserts) {
        this.desserts = desserts;
    }
}
