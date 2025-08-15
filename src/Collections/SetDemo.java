package Collections;

import java.util.HashSet;

public class SetDemo {
    public static void main(String[] args) {
        HashSet<String> vehiclePlates = new HashSet<>();

        // Add elements
        vehiclePlates.add("KA01AB1234");
        vehiclePlates.add("KA02CD5678");
        vehiclePlates.add("KA01AB1234"); // duplicate

        // Display all
        System.out.println(vehiclePlates);

        // Check membership
        System.out.println(vehiclePlates.contains("KA01AB1234")); // true
        System.out.println(vehiclePlates.contains("MH04XY1111")); // false

        // Remove
        vehiclePlates.remove("KA01AB1234");
        System.out.println(vehiclePlates);
    }
}