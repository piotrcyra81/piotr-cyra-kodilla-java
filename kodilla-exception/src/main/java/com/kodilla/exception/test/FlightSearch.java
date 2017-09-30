import com.kodilla.exception.test.Flight;
import com.kodilla.exception.test.RouteNotFoundException;

import java.util.HashMap;
import java.util.Map;

public class FlightSearch {

    public boolean findFlight(Flight flight) throws RouteNotFoundException {

        Map<String, Boolean> airports = new HashMap<>();
        airports.put("Warsaw Air Port", true);

        if (airports.containsKey(flight.getArrivalAirport())) {
            System.out.println("Arrival airport " + flight.getArrivalAirport() + " is available");
            return airports.get(flight.getArrivalAirport());
        }
        throw new RouteNotFoundException("No airplane connection!");
    }

    public static void main(String[] args){

        Flight firstFlight = new Flight("Cracow Air Port", "Warsaw Air Port");

        FlightSearch flightSearch = new FlightSearch();

        try {
            flightSearch.findFlight(firstFlight);
        }
        catch (RouteNotFoundException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Have a nice flight");
        }
    }
}