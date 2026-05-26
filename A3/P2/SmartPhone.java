class SmartPhone extends Electronics {
    private String batteryLife;

    public SmartPhone(String name, double price, String warrentyPeriod, String batteryLife) {
        super(name, price, warrentyPeriod);
        this.batteryLife = batteryLife;
    }

    public String getBatteryLife() {
        return batteryLife;
    }

    public void setBatteryLife(String batteryLife) {
        this.batteryLife = batteryLife;
    }

    public void displayDetails() {
        System.out.println("Product Name: " + getName());
        System.out.println("Price: $" + getPrice());
        System.out.println("Warranty Period: " + getWarrentyPeriod());
        System.out.println("Battery Life: " + batteryLife);
    }
}