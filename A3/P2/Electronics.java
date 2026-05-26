class Electronics extends Product {
    private String warrentyPeriod;
    public Electronics(String name, double price, String warrentyPeriod) {
        super(name, price);
        this.warrentyPeriod = warrentyPeriod;
    }

    public void setWarrentyPeriod(String warrentyPeriod) {
        this.warrentyPeriod = warrentyPeriod;
    }

    public String getWarrentyPeriod() {
        return warrentyPeriod;
    }

}