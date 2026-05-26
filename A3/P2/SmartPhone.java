class SmartPhone extends Electronics {
    private String batteryLife;

    public SmartPhone(String name, double price, int warrentyPeriod, String batteryLife) {
        super(name, price, warrentyPeriod);
        this.batteryLife = batteryLife;
    }

    public String getBatteryLife() {
        return batteryLife;
    }

    public void setBatteryLife(String batteryLife) {
        this.batteryLife = batteryLife;
    }
}