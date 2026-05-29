
public class EcommerceOrder {
    public static void main(String[] args) {
        Product p = new Product("Bat", 5);
        
        try{
            p.purchase(10);
        } catch (OutOfStockException e) {
            System.out.println("Order Failed: " + e.getMessage());
        }
    }
}
