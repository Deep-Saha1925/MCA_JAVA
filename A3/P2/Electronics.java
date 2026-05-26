class Electronics extends Product {
    private int warrentyPeriod;
    public Electronics(String name, double price, int warrentyPeriod) {
        super(name, price);
        this.warrentyPeriod = warrentyPeriod;
    }

    public void setWarrentyPeriod(int warrentyPeriod) {
        this.warrentyPeriod = warrentyPeriod;
    }

    public int getWarrentyPeriod() {
        return warrentyPeriod;
    }

}