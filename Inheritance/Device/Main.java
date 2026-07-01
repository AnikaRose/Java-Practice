package Inheritance.Device;

/**
 *
 * @author anika
 */
public class Main {
    public static void main(String[] args) {
        // Creating devices
        Device Device1 = new Device("Sony", 299.99);
        Device Device2 = new Device("Sony", 299.99);
        Device Device3 = new Device("Apple", 999.99);

        // Creating Laptops (Inheritance in action)
        Laptop laptop1 = new Laptop("Dell", 800.00, 16);
        Laptop laptop2 = new Laptop("Dell", 800.00, 16);
        Laptop laptop3 = new Laptop("Dell", 800.00, 8); // Different RAM

        // --- Testing Equals Method ---
        System.out.println("Devices:");
        System.out.println(Device1+" "+Device2+" "+Device3);
        System.out.println("Laptops:");
        System.out.println(laptop1+" "+laptop2+" "+laptop3);
        System.out.println(laptop3);
        
        System.out.println("--- Generic Device Comparisons ---");
        System.out.println("Is device1 equal to device2? " + Device1.equals(Device2)); // True
        System.out.println("Is device1 equal to device3? " + Device1.equals(Device3)); // False

        System.out.println("\n--- Laptop Comparisons (Inheritance & Overriding) ---");
        // True because brand, price, AND ram match
        System.out.println("Is laptop1 equal to laptop2? " + laptop1.equals(laptop2)); 
        
        // False because even though brand and price match, RAM is different
        System.out.println("Is laptop1 equal to laptop3? " + laptop1.equals(laptop3)); 

        // False because they are different types altogether
        System.out.println("\n--- Cross-Class Comparison ---");
        System.out.println("Is laptop1 equal to Device1? " + laptop1.equals(Device1)); 
    }
}
