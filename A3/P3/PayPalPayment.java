class PayPalPayment extends Payment {
    
    private String transactionId;
    private double amount;

    PayPalPayment(String transactionId, double amount) {
        this.transactionId = transactionId;
        this.amount = amount;
    }

    @Override
    public void processPayment() {
        // PayPal: Charge 3% transaction fee.
        System.out.println("Processing PayPal payment with transaction ID: " + transactionId + " and amount: " + amount*1.03);

    }

}