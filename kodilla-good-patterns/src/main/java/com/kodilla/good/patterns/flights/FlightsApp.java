package com.kodilla.good.patterns.flights;

public class FlightsApp {

    public static void main(String[] args) {

        FindFlight findFlight = new FindFlight("GDAŃSK", "WROCŁAW");

        findFlight.flightFromCity();
        findFlight.flightToCity();
    }
}