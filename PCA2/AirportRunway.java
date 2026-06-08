public class AirportRunway {
    public static void main(String[] args) {
        Runway runway = new Runway(1);
        String flightName = "AIR INDIA", operation = "takeoff";
        Flight flight = new Flight(runway, flightName, operation);
        runway.useRunway(flightName, operation);
    }
}