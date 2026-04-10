import java.util.HashMap;
import java.util.Map;

public class TrainApp {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        // UC6: Mapping Bogies to their respective Capacities using HashMap
        Map<String, Integer> bogieCapacities = new HashMap<>();

        // Mapping bogie types (Keys) to capacities (Values)
        bogieCapacities.put("Sleeper", 72);
        bogieCapacities.put("AC Chair", 56);
        bogieCapacities.put("First Class", 24);
        bogieCapacities.put("Cargo-Rect", 500); // 500 tons
        bogieCapacities.put("Cargo-Cyl", 400);  // 400 tons

        System.out.println("\n--- Bogie Capacity Mapping Registered ---");

        // Iterating through the map using entrySet() to display all data
        for (Map.Entry<String, Integer> entry : bogieCapacities.entrySet()) {
            System.out.println("Bogie Type: " + entry.getKey() + " | Capacity: " + entry.getValue());
        }

        // Fast Lookup Example
        String searchBogie = "AC Chair";
        if (bogieCapacities.containsKey(searchBogie)) {
            System.out.println("\nQuick Search: " + searchBogie + " has a capacity of " + bogieCapacities.get(searchBogie) + " units.");
        }
    }
}