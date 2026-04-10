import java.util.HashSet;
import java.util.Set;

public class TrainApp {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        // UC3: Track Unique Bogie IDs using HashSet
        System.out.println("\n--- Registering Bogie IDs ---");

        Set<String> bogieIds = new HashSet<>();

        // Adding unique and duplicate IDs
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");

        // Attempting to add a duplicate ID
        System.out.println("Attempting to add duplicate ID: BG101");
        bogieIds.add("BG101");

        // Displaying the Set
        System.out.println("Unique Bogie IDs in System: " + bogieIds);
        System.out.println("Total Unique Bogies: " + bogieIds.size());

        // Checking existence of a specific ID
        String searchId = "BG102";
        if (bogieIds.contains(searchId)) {
            System.out.println("ID " + searchId + " is valid and registered.");
        }
    }
}