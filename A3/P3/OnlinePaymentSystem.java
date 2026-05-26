public class OnlinePaymentSystem {
    public static void main(String[] args) {
        Payment creditCardPayment = new CreditCardPayment("TXN12345", 200.0);
        Payment payPalPayment = new PayPalPayment("TXN54321", 200.0);

        creditCardPayment.processPayment();
        payPalPayment.processPayment();
    }
}