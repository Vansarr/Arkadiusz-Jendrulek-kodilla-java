package com.good.patterns.challenges.food2Door;


import java.util.Map;

public class GlutenFreeShop implements Supplier{

    private Map<String, Integer> listProduct = Map.of(
            "gluten free food", 3
    );

    @Override
    public boolean process(Customer customer, Product product, int count) {
        int availableProductCount = listProduct.getOrDefault(product.getName(), 0);

        if (availableProductCount >= count) {
            System.out.println(customer.getName() + "\n" + "order: "  + count  + " " + product.getName());
            return true;

        } else {
            System.out.println("Sorry, product is unavailable.");
            return false;
        }
    }
}

