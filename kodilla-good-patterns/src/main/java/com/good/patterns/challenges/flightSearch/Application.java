package com.good.patterns.challenges.flightSearch;

import java.util.List;

public class Application {
    public static void main(String[] args) {

        FlightSearch flightSearch = new FlightSearch();

        List<Flight> flightsFromATL = flightSearch.findAllDepartures("ATL");
        List<Flight> flightsToLAS = flightSearch.findAllArrivals("LAS");

        System.out.println(flightsFromATL);
        System.out.println(flightsToLAS);

        flightSearch.findDetour("ATL", "LAS");

    }

}
