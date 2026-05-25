class Car extends Vehicle {
    private String fuelType;    // Petrol, Diesel, Electric.

    public Car(String brand, String model, int year, String fuelType) {
        super(brand, model, year);
        this.fuelType = fuelType;
    }

    public String getFuelType() {
        return fuelType;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Fuel Type: " + fuelType);
    }
}