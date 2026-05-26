class CreditCardPayment extends Payment {

    private String transactionId;
    private double amount;

    CreditCardPayment(String transactionId, double amount) {
        this.transactionId = transactionId;
        this.amount = amount;
    }

    @Override
    public void processPayment() {
        // Credit Card: Charge 2% transaction fee.
        System.out.println("Processing credit card payment with transaction ID: " + transactionId + " and amount: " + amount*1.02);
    }

}