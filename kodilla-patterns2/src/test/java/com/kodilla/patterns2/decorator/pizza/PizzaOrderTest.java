package com.kodilla.patterns2.decorator.pizza;

import com.kodilla.patterns2.decorator.taxiportal.BasicTaxiOrder;
import com.kodilla.patterns2.decorator.taxiportal.TaxiOrder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PizzaOrderTest {

    @Test
    public void testPizzaWithToppingsAndDoubleCheese() {
        //Given
        PizzaOrder thePizza = new BasicPizzaOrder();
        thePizza = new MeatDecorator(thePizza);
        thePizza = new VegetableDecorator(thePizza);
        thePizza = new AdditionalCheeseDecorator(thePizza);
        System.out.println(thePizza.getDescription());
        System.out.println(thePizza.getCost() + " zł");
        //When
        String description = thePizza.getDescription();
        //Then
        assertEquals("Ordering a pizza: marinara sauce, mozzarella, meat, vegetable, additional cheese", description);
    }


}