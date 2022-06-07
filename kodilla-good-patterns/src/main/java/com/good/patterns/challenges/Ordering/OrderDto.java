package com.good.patterns.challenges.Ordering;

import java.util.ArrayList;

public class OrderDto {

    private Buyer buyer;
    private Seller seller;
    private ArrayList<Product> orderedProducts;
    private double orderPrice;

    public OrderDto(Buyer buyer, Seller seller, ArrayList<Product> orderedProducts, double orderPrice) {
        this.buyer = buyer;
        this.seller = seller;
        this.orderedProducts = orderedProducts;
        this.orderPrice = orderPrice;
    }

    public Seller getSeller() {
        return seller;
    }

    public Buyer getBuyer() {
        return buyer;
    }

    public ArrayList<Product> getOrderedProducts() {
        return orderedProducts;
    }

    public double getOrderPrice() {
        return orderPrice;
    }
}
