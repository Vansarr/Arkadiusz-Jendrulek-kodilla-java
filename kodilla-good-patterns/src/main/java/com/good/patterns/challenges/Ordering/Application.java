package com.good.patterns.challenges.Ordering;

import java.util.ArrayList;

public class Application {


    public static void main(String[] args) {

        Buyer buyer1 = new Buyer("nabywca", "Piotr", "Nabywający", "nabywca@gmail.com");
        Seller seller1 = new Seller("sprzedawca", "Jerzy", "Sprzedający", "sprzedawca@gmail.com");
        Product product1 = new Product("spodnie", 59.99);
        Product product2 = new Product("buty", 99.99);

        ArrayList<Product> orderedProducts = new ArrayList<>(){{
            add(product1);
            add(product2);
        }};

        OrderRequest newOrder = new OrderRequest(buyer1, seller1, orderedProducts);
        EmailService emailService = new EmailService();
        TextRepository textRepository = new TextRepository();

        ProductOrderService productOrderService = new ProductOrderService(emailService, textRepository);

        productOrderService.process(newOrder);

    }

}