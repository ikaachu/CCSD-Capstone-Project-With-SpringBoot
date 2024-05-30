package com.capstone.ccsd.dessert;

import com.capstone.ccsd.cart.Cart;
import com.capstone.ccsd.category.Category;
import com.capstone.ccsd.order.Order;
import com.capstone.ccsd.seller.Seller;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Dessert")
public class Dessert {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DessertId")
    private Integer dessertId;
    @Column(name = "DessertName")
    private String dessertName;
    @Column(name = "DessertQuantity")
    private Integer dessertQuantity;
    @Column(name = "DessertDescription")
    private String dessertDescription;
    @Column(name = "DessertPrice")
    private Double dessertPrice;
    @Column(name = "DessertImage")
    private Double dessertImage;
    @ManyToOne
    @JoinColumn(name = "category_CategoryId")
    private Category category;
    @ManyToMany(mappedBy = "desserts")
    private Set<Cart> carts;
    @ManyToMany
    @JoinTable(
            name = "Dessert_has_Order",
            joinColumns = @JoinColumn(name = "Dessert_DessertId"),
            inverseJoinColumns = @JoinColumn(name = "Order_OrderId")
    )
    private Set<Order> orders;
    @ManyToOne
    @JoinColumn(name = "seller_SellerId")
    private Seller seller;

    public Integer getDessertId() {
        return dessertId;
    }

    public void setDessertId(Integer dessertId) {
        this.dessertId = dessertId;
    }

    public String getDessertName() {
        return dessertName;
    }

    public void setDessertName(String dessertName) {
        this.dessertName = dessertName;
    }

    public Integer getDessertQuantity() {
        return dessertQuantity;
    }

    public void setDessertQuantity(Integer dessertQuantity) {
        this.dessertQuantity = dessertQuantity;
    }

    public String getDessertDescription() {
        return dessertDescription;
    }

    public void setDessertDescription(String dessertDescription) {
        this.dessertDescription = dessertDescription;
    }

    public Double getDessertPrice() {
        return dessertPrice;
    }

    public void setDessertPrice(Double dessertPrice) {
        this.dessertPrice = dessertPrice;
    }

    public Double getDessertImage() {
        return dessertImage;
    }

    public void setDessertImage(Double dessertImage) {
        this.dessertImage = dessertImage;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Set<Cart> getCarts() {
        return carts;
    }

    public void setCarts(Set<Cart> carts) {
        this.carts = carts;
    }

    public Set<Order> getOrders() {
        return orders;
    }

    public void setOrders(Set<Order> orders) {
        this.orders = orders;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }
}
