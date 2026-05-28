import travel.flights.Flight;
import travel.hotels.Hotel;

public class TravelBooking {
    public static void main(String[] args) {
        Flight flight = new Flight("AI101", "New York", 500.0);
        Hotel hotel = new Hotel("Grand Hotel", "New York", 200.0);

        Booking booking = new Booking();
        booking.bookFlight(flight);
        booking.bookHotel(hotel);
    }
}