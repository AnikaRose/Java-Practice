package Inheritance.Device;

/**
 *
 * @author anika
 */
public class Main {
    public static void main(String[] args) {
        // Creating generic devices
        Device genericDevice1 = new Device("Sony", 299.99);
        Device genericDevice2 = new Device("Sony", 299.99);
        Device genericDevice3 = new Device("Apple", 999.99);

        // Creating Laptops (Inheritance in action)
        Laptop laptop1 = new Laptop("Dell", 800.00, 16);
        Laptop laptop2 = new Laptop("Dell", 800.00, 16);
        Laptop laptop3 = new Laptop("Dell", 800.00, 8); // Different RAM

        // --- Testing Equals Method ---
        System.out.println("Generic Devices:");
        System.out.println(genericDevice1+" "+genericDevice2+" "+genericDevice3);
        System.out.println("Laptops:");
        System.out.println(laptop1+" "+laptop2+" "+laptop3);
        System.out.println(laptop3);
        
        System.out.println("--- Generic Device Comparisons ---");
        System.out.println("Is device1 equal to device2? " + genericDevice1.equals(genericDevice2)); // True
        System.out.println("Is device1 equal to device3? " + genericDevice1.equals(genericDevice3)); // False

        System.out.println("\n--- Laptop Comparisons (Inheritance & Overriding) ---");
        // True because brand, price, AND ram match
        System.out.println("Is laptop1 equal to laptop2? " + laptop1.equals(laptop2)); 
        
        // False because even though brand and price match, RAM is different
        System.out.println("Is laptop1 equal to laptop3? " + laptop1.equals(laptop3)); 

        // False because they are different types altogether
        System.out.println("\n--- Cross-Class Comparison ---");
        System.out.println("Is laptop1 equal to genericDevice1? " + laptop1.equals(genericDevice1)); 
    }
}
