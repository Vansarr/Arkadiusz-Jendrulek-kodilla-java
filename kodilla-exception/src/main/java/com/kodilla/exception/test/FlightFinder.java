package com.kodilla.exception.test;

import java.util.HashMap;

public class FlightFinder {

    public void findFlight(Flight flight) throws RouteNotFoundException {
        HashMap<String, Boolean> validAirpts = new HashMap<>();
        validAirpts.put("IAD", true);
        validAirpts.put("ATL", true);
        validAirpts.put("SZX", true);
        validAirpts.put("WAW", false);
        validAirpts.put("DFW", true);

        if (validAirpts.containsKey(flight.getDepartureAirport()) &&
                validAirpts.containsKey(flight.getArrivalAirport()))
        {
            System.out.println("Flight " + flight.getDepartureAirport() +
            "||" + flight.getArrivalAirport() + " found");
        } else {
            throw new RouteNotFoundException("Airport unavailable or nonexistent");
        }
    }

    public static void main(String[] args) {
        FlightFinder ff = new FlightFinder();

        try {
            ff.findFlight(new Flight("IAD", "DGE"));
        } catch (RouteNotFoundException e) {
            System.out.println("Flight not found");
        }


    }
}

