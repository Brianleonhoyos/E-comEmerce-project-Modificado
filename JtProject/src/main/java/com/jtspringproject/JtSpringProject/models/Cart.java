package com.jtspringproject.JtSpringProject.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity(name="CART")
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @OneToMany(mappedBy = "cart", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<CartProduct> cartProducts = new ArrayList<>();

    public Cart() {}

    public Cart(List<CartProduct> cartProducts) {
        this.cartProducts = cartProducts;
    }

    public static class Builder {
        private List<CartProduct> cartProducts = new ArrayList<>();

        public Builder setCartProducts(List<CartProduct> cartProducts) {
            this.cartProducts = cartProducts;
            return this;
        }

        public Cart build() {
            return new Cart(cartProducts);
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<CartProduct> getCartProducts() {
        return cartProducts;
    }

    public void setCartProducts(List<CartProduct> cartProducts) {
        this.cartProducts = cartProducts;
    }
}
