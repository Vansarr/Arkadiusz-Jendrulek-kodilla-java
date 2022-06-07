package com.good.patterns.challenges.Ordering;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class OrderRequest {

    private Buyer buyer;
    private Seller seller;
    private ArrayList<Product> orderedProducts;
    private double orderPrice;

    public OrderRequest(Buyer buyer, Seller seller, ArrayList<Product> orderedProducts) {
        this.buyer = buyer;
        this.seller = seller;
        this.orderedProducts = orderedProducts;
    }

    public Buyer getBuyer() {
        return buyer;
    }

    public Seller getSeller() {
        return seller;
    }

    public ArrayList<Product> getOrderedProducts() {
        return orderedProducts;
    }

    public double getOrderPrice() {
        return this.orderedProducts.stream()
                .mapToDouble(Product::getPrice)
                .sum();
    }

}
