class SmartWatch implements FitnessTracker, NotificationReceiver {
    String watchBrand;
    String model;
    int stepsCount;

    SmartWatch(String watchBrand, String model) {
        this.watchBrand = watchBrand;
        this.model = model;
    }

    @Override
    public void countSteps() {
        stepsCount += 1000;
        System.out.println("Steps counted: " + stepsCount);
    }

    @Override
    public void calculateCalories() {
        double caloriesBurned = stepsCount * 0.04;
        System.out.println("Calories burned: " + caloriesBurned);
    }

    @Override
    public void receiveNotification() {
        System.out.println(notificationMessage);
    }

    @Override
    public void displayNotification() {
        System.out.println("Displaying notification on " + watchBrand + " " + model);
    }

    public static void main(String[] args) {
        SmartWatch myWatch = new SmartWatch("FitBrand", "ModelX");
        myWatch.countSteps();
        myWatch.calculateCalories();
        myWatch.receiveNotification();
    }

}