package com.kodilla.good.patterns.flights;

import java.util.List;
import java.util.stream.Collectors;

public class FindFlight {

    String fromCity;
    String toCity;

    public FindFlight(String fromCity, String toCity) {
        this.fromCity = fromCity;
        this.toCity = toCity;
    }

    FlightList flightList = new FlightList();

    public void flightFromCity() {

        System.out.println("Flights from city " + fromCity);

        List<Flight> resultFormCity = flightList.getFlights().stream()
                .filter(f -> f.getFlightFrom().equals(fromCity))
                .collect(Collectors.toList());

        if (resultFormCity.size() > 0) {
            resultFormCity.stream()
                    .forEach(System.out::println);
        } else {
            System.out.println("No flight connetion from this city");
        }
    }

    public void flightToCity() {

        System.out.println("Flights to city " + toCity);

        List<Flight> resultToCity = flightList.getFlights().stream()
                .filter(f -> f.getFlightTo().equals(toCity))
                .collect(Collectors.toList());

        if (resultToCity.size() > 0) {
            resultToCity.stream()
                    .forEach(System.out::println);
        } else {
            System.out.println("No flight connetion to this city");
        }
    }
}
