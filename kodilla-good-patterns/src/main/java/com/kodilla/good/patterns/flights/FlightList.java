package com.kodilla.good.patterns.flights;

import java.util.ArrayList;
import java.util.List;

public class FlightList {

    public List<Flight> flights = new ArrayList<>();

    public FlightList() {
        flights.add(new Flight("GDAŃSK", "WROCŁAW"));
        flights.add(new Flight("WROCŁAW", "KRAKÓW"));
        flights.add(new Flight("KRAKÓW", "POZNAŃ"));
        flights.add(new Flight("POZNAŃ", "KATOWICE"));
    }

    public List<Flight> getFlights() {
        return new ArrayList<>(flights);
    }
}