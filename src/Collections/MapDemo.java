package Collections;

import java.util.HashMap;

public class MapDemo {
    public static void main(String[] args) {
        HashMap<String, String> vehicleOwners = new HashMap<>();

        // Add key-value pairs
        vehicleOwners.put("KA01AB1234", "Aayam");
        vehicleOwners.put("KA02CD5678", "Aaryan");
        vehicleOwners.put("KA03EF9999", "Sunil");

        // Display map
        System.out.println(vehicleOwners);

        // Fetch owner of a vehicle
        System.out.println("Owner of KA02CD5678: " + vehicleOwners.get("KA02CD5678"));

        // Remove a mapping
        vehicleOwners.remove("KA01AB1234");
        System.out.println(vehicleOwners);

        // Check if key exists
        System.out.println(vehicleOwners.containsKey("KA03EF9999")); // true
        System.out.println(vehicleOwners.containsKey("KA01AB1234")); // false
    }
}
