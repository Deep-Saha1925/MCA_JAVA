interface NotificationReceiver {
    String notificationMessage = "You have a new notification!";
    void receiveNotification();
    void displayNotification();
}