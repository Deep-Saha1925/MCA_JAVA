//1. Implement multilevel inheritance using the given classes.
//2. Create objects and demonstrate the working of constructors.
//3. Override a method in the child class to display details of LuxuryCar.
import java.util.Scanner;
public class VMS_1 {
    public static void main(String[] args) {

        // Taking user input for Vehicle
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Vehicle Brand: ");
        String brand = sc.nextLine();
        System.out.print("Enter Vehicle Model: ");
        String model = sc.nextLine();
        System.out.print("Enter Vehicle Year: ");
        int year = sc.nextInt();
        sc.nextLine(); // Consume the newline
        System.out.print("Enter Vehicle Fuel Type: ");
        String fuelType = sc.nextLine();

        LuxuryCar myCar = new LuxuryCar(brand, model, year, fuelType,
                "Sunroof");
        myCar.displayInfo();

        // LuxuryCar myCar = new LuxuryCar("Tesla", "Model S", 2023, "Electric",
        //         "Sunroof");
        // myCar.displayInfo();
    }
}