package com.good.patterns.challenges.Ordering;

public class EmailService implements InformationService {

    @Override
    public void informBuyer(Buyer buyer){

        System.out.println("Wysłano do:" + buyer.getEmail() + "\n" +
                "Witaj," + buyer.getName() + "!\n" +
                "Twoje zamówienie zostało skompletowane i jest gotowe do wysyłki.");
    }
}
