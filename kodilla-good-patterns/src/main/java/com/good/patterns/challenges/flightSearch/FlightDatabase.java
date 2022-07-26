package com.good.patterns.challenges.flightSearch;

import java.util.HashSet;
import java.util.Set;

public class FlightDatabase {

    private static final Set<Flight> allFlights = new HashSet<>() {
        {
            add(new Flight("ATL","DFW"));
            add(new Flight("ATL","LAX"));
            add(new Flight("ATL","CAN"));
            add(new Flight("MCO","DEN"));
            add(new Flight("DEN","ATL"));
            add(new Flight("LAX","LAS"));
            add(new Flight("ORD","DFW"));
            add(new Flight("ORD","ATL"));
            add(new Flight("ORD","LAS"));
    }
    };

    public static Set<Flight> getAllFlights() {
        return new HashSet<>(allFlights);
    }
}
