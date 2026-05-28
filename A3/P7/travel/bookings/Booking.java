package A3.P7.travel.bookings;

import travel.flights.Flight;

public class Booking {
    public void bookFlight(Flight f){
        System.out.println("Booking flight: " + f.getDetails());
    }
}
