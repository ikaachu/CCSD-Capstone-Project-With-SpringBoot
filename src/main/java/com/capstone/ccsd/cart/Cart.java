package com.capstone.ccsd.cart;

import com.capstone.ccsd.category.Category;
import com.capstone.ccsd.customer.Customer;
import com.capstone.ccsd.dessert.Dessert;
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
@Table(name = "Cart")
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CartId")
    private Integer cartId;
    @Column(name = "CartTotalPrice")
    private Double cartTotalPrice;
    @Column(name = "CartQuantity")
    private Integer cartQuantity;
    @ManyToOne
    @JoinColumn(name = "customer_CustId")
    private Customer customer;
    @ManyToMany
    @JoinTable(
            name = "Cart_has_Dessert",
            joinColumns = @JoinColumn(name = "Cart_CartId"),
            inverseJoinColumns = @JoinColumn(name = "Dessert_DessertId")
    )
    private Set<Dessert> desserts;
    @ManyToMany
    @JoinTable(
            name = "category_cart",
            joinColumns = @JoinColumn(name = "cart_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id")
    )
    private Set<Category> categories;

    public Integer getCartId() {
        return cartId;
    }

    public void setCartId(Integer cartId) {
        this.cartId = cartId;
    }

    public Double getCartTotalPrice() {
        return cartTotalPrice;
    }

    public void setCartTotalPrice(Double cartTotalPrice) {
        this.cartTotalPrice = cartTotalPrice;
    }

    public Integer getCartQuantity() {
        return cartQuantity;
    }

    public void setCartQuantity(Integer cartQuantity) {
        this.cartQuantity = cartQuantity;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Set<Dessert> getDesserts() {
        return desserts;
    }

    public void setDesserts(Set<Dessert> desserts) {
        this.desserts = desserts;
    }

    public Set<Category> getCategories() {
        return categories;
    }

    public void setCategories(Set<Category> categories) {
        this.categories = categories;
    }
}
