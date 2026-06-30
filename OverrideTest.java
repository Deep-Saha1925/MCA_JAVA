class Vehicle {
    String fuel = "Petrol";
    void start() {
        System.out.println("Vehicle starting with " + fuel);
    }
    double calculateMileage() { return 15.0; }
}
class ElectricCar extends Vehicle {
    @Override                    // annotation confirms override
    void start() {
        System.out.println("Electric car starting silently");
    }
    @Override
    double calculateMileage() { return 0.0; }  // kWh not mileage
    // Covariant return type example
    // Parent returns Number, child can return Integer (subtype)
}
public class OverrideTest {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();  // polymorphism
        v.start();          // Electric car starting silently
        // Runtime decides based on actual object
    }
}
