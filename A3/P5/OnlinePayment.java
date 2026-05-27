public class OnlinePayment implements CardPayment, UPIPayment {
    @Override
    public void payViaUPI() {
        System.out.println("Paying via UPI");
    }

    @Override
    public void payViaCard() {
        System.out.println("Paying via Card");
    }


}
