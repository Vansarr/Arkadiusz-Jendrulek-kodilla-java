package com.good.patterns.challenges.Ordering;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class TextRepository implements OrderRepository{

    @Override
    public void saveOrder(Buyer buyer, Seller seller, ArrayList<Product> orderedProducts, double orderPrice) {

        String productsList = orderedProducts.stream()
                .map(Product::getName)
                .collect(Collectors.joining(", "));

        try {
            BufferedWriter order = new BufferedWriter(new FileWriter("order.txt"));
            order.write("kupujący: " + buyer.getName() + "\n" +
                            "sprzedawca: " + seller.getName() + "\n" +
                            "zakupione produkty" + productsList + "\n" +
                            "Wartość zamówienia: " + orderPrice + "\n");
        } catch (IOException e) {
            System.out.println("Wystąpił błąd - nie udało się zapisać zamówienia.");
        }

    }
}
