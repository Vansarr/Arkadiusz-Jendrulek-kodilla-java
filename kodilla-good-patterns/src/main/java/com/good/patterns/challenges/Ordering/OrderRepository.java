package com.good.patterns.challenges.Ordering;

import java.util.ArrayList;

public interface OrderRepository {

    void saveOrder(Buyer buyer, Seller seller, ArrayList<Product> orderedProducts, double orderPrice);

}
