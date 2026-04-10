import java.util.ArrayList;
import java.util.List;

public class TrainApp {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        // UC1: Initialize Train
        List<String> bogies = new ArrayList<>();
        System.out.println("Initial bogie count: " + bogies.size());

        // UC2: Add Passenger Bogies
        System.out.println("\n--- Adding Passenger Bogies ---");
        bogies.add("Sleeper");
        bogies.add("AC Chair");
        bogies.add("First Class");

        System.out.println("Current Consist: " + bogies);
        System.out.println("Bogie count: " + bogies.size());

        // Removing a bogie
        System.out.println("\n--- Removing AC Chair ---");
        bogies.remove("AC Chair");
        System.out.println("Consist after removal: " + bogies);

        // Checking existence
        System.out.println("\n--- Checking Bogie Status ---");
        if (bogies.contains("Sleeper")) {
            System.out.println("Sleeper bogie is present in the consist.");
        } else {
            System.out.println("Sleeper bogie is not found.");
        }

        // Final State
        System.out.println("\nFinal Bogie count: " + bogies.size());
        System.out.println("Final Consist Summary: " + bogies);
    }
}