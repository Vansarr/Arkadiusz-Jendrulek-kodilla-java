package com.good.patterns.challenges.food2Door;

import java.util.ArrayList;
import java.util.List;

public class ExtraFoodShop implements Supplier{

    private List<String> extraProducts = new ArrayList<>();

    @Override
    public OrderDto process(final OrderRequest orderRequest) {



        return new OrderDto(orderRequest.getSupplier(), orderRequest.getProducts(), orderRequest.getTotalCost());
    }

}

