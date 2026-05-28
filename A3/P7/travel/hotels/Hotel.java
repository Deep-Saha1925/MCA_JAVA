package travel.hotels;

public class Hotel {
    String hotelName;
    String location;
    double price;

    public Hotel(String hotelName, String location, double price) {
        this.hotelName = hotelName;
        this.location = location;
        this.price = price;
    }

    public String getDetails() {
        return "Hotel: " + hotelName +
               ", Location: " + location +
               ", Price: " + price;
    }
}