class LuxuryCar extends Car {
    // Added features
    // sunroof, leather seats, autopilot

    private String feature;

    public LuxuryCar(String brand, String model, int year, String fuelType,
                      String feature) {
        super(brand, model, year, fuelType);
        this.feature = feature;
    }

    public String getFeature() {
        return feature;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Feature: " + feature);
    }
}