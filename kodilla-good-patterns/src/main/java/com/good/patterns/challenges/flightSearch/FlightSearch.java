package com.good.patterns.challenges.flightSearch;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static com.good.patterns.challenges.flightSearch.FlightDatabase.getAllFlights;

public class FlightSearch {

    public List<Flight> findAllDepartures(String departure) {

        return getAllFlights().stream()
                .filter(flight -> flight.getDepartureAirport().equals(departure))
                .collect(Collectors.toList());
    }

    public List<Flight> findAllArrivals(String arrival) {

        return getAllFlights().stream()
                .filter(flight -> flight.getArrivalAirport().equals(arrival))
                .collect(Collectors.toList());
    }

    public List<List<Flight>> findDetour (String departure, String arrival) {

        List<Flight> findAllDepartures = findAllDepartures(departure);

        List<Flight> findAllArrivals = findAllArrivals(arrival);

        List<List<Flight>> wholeFlight = new ArrayList<>();

        findAllDepartures.stream()
                .filter(flight -> findAllArrivals.contains(new Flight(flight.getArrivalAirport(),arrival)))
                .forEach(firstLegFlight -> {
                    List<Flight> connection = new ArrayList<>();
                    connection.add(firstLegFlight);
                    connection.add(new Flight(firstLegFlight.getArrivalAirport(), arrival));
                    String detour = firstLegFlight.getArrivalAirport();
                    wholeFlight.add(connection);
                    System.out.println("Found flight from " + departure + " to " + arrival + " via " + detour);
                });

        return wholeFlight;
    }

}