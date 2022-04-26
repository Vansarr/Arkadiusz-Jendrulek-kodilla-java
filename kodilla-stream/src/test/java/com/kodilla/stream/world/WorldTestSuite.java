package com.kodilla.stream.world;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class WorldTestSuite {


    @Test
    public void testGetPeopleQuantity() {
        //Given
        World earth = new World();
        Continent europe = new Continent();
        Continent africa = new Continent();
        Country poland = new Country(new BigDecimal("37.95"));
        Country ukraine = new Country(new BigDecimal("44.13"));
        Country nigeria = new Country(new BigDecimal("206.10"));
        Country egypt = new Country(new BigDecimal("102.30"));
        earth.addContinent(europe);
        earth.addContinent(africa);
        europe.addCountry(poland);
        europe.addCountry(ukraine);
        africa.addCountry(nigeria);
        africa.addCountry(egypt);
        //When
        BigDecimal totalPeople = earth.getPeopleQuantity();
        //Then
        BigDecimal expectedPeople = new BigDecimal("390.48");
        Assertions.assertEquals(expectedPeople, totalPeople);
    }
}
