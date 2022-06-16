package com.good.patterns.challenges.food2Door;

public class OrderDto {

    private String supplier;
    private String products;
    private double totalCost;

    public OrderDto(String supplier, String products, double totalCost) {
        this.supplier = supplier;
        this.products = products;
        this.totalCost = totalCost;
    }

    public String getSupplier() {
        return supplier;
    }

    public String getProducts() {
        return products;
    }

    public double getTotalCost() {
        return totalCost;
    }
}
