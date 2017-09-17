import com.kodilla.exception.test.Flight;
import com.kodilla.exception.test.RouteNotFoundException;

import java.util.HashMap;
import java.util.Map;

public class FlightSearch {

    public void findFilght(Flight flight) throws RouteNotFoundException {

        Map<String, Boolean> airports = new HashMap<>();
        airports.put("Warsaw Air Port", false);
        airports.put("Cracow Air Port", true);

        for (Map.Entry<String, Boolean> entry : airports.entrySet()) {

            String key = entry.getKey();
            Boolean value = entry.getValue();

            if (key == flight.getArrivalAirport() && value == true) {
                System.out.println("Have a nice flight");
                if (key == flight.getDepartureAirport() && value == true || key == flight.getArrivalAirport() && value == true) {
                } else {
                    throw new RouteNotFoundException("No airplane connection!");
                }
            }
        }
    }

    public static void main(String[] args) throws RouteNotFoundException {

        Flight flight = new Flight("Warsaw Air Port", "Cracow Air Port");
        FlightSearch flightSearch = new FlightSearch();
        flightSearch.findFilght(flight);
    }
}