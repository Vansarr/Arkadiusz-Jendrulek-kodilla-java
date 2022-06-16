package com.good.patterns.challenges.food2Door;

import java.util.ArrayList;
import java.util.List;

public class HealthyShop implements Supplier{

    private final List<String> healthyProducts = new ArrayList<>();

    @Override
    public OrderDto process(final OrderRequest orderRequest) {


        return new OrderDto(orderRequest.getSupplier(), orderRequest.getProducts(), orderRequest.getTotalCost());
    }

}
