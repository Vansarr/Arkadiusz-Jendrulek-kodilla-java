package com.good.patterns.challenges.food2Door;

import java.util.Map;

public class Application {
    public static void main(String[] args) {

        OrderProcessor orderProcessor = new OrderProcessor();
        Supplier glutenFreeShop = new GlutenFreeShop();
        Supplier extraFoodShop = new ExtraFoodShop();
        Customer customer1 = new Customer("John Doe");

        OrderRequest orderRequest1 = new OrderRequest(
                customer1,
                Map.of(
                        new Product("gluten free food", glutenFreeShop), 3
                )
        );

        OrderRequest orderRequest2 = new OrderRequest(
                customer1,
                Map.of(
                        new Product("extra food", glutenFreeShop), 6
                )
        );

        orderProcessor.processAll(orderRequest1);
        orderProcessor.processAll(orderRequest2);


    }
}
