package com.good.patterns.challenges.food2Door;

public class OrderProcessor {

    public void processAll(OrderRequest orderRequest) {

        orderRequest.getProducts().entrySet().stream()
                .map(l -> l.getKey().getSupplier().process(orderRequest.getCustomer(), l.getKey(), l.getValue()))
                .forEach(System.out::println);
    }
}
