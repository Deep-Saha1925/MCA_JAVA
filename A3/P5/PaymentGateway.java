import java.util.Scanner;

public class PaymentGateway {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which payment method do you want to use? (1 for Card, 2 for UPI)");
        int choice = scanner.nextInt();

        OnlinePayment payment = new OnlinePayment();

        switch (choice) {
            case 1 -> payment.payViaCard();
            case 2 -> payment.payViaUPI();
            default -> System.out.println("Invalid choice");
        }
        scanner.close();
    }
}
