package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigmacTestSuite {
    @Test
    void testNewBigMac() {
        //Given
        Bigmac mac = new Bigmac.BigmacBuilder()
                .bun("sesame")
                .burgers(2)
                .sauce("barbecue")
                .ingredients("onion")
                .ingredients("jalapeno")
                .ingredients("bacon")
                .build();
        System.out.println(mac);

        //When
        int ingredientsCount = mac.getIngredients().size();

        //Then
        assertEquals(3, ingredientsCount);
    }
}