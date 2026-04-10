public class TrainApp {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");
        System.out.println("--- Handling Invalid Bogie Capacity ---\n");

        // Test Case 1: Valid Capacity
        try {
            Bogie validBogie = new Bogie("Sleeper", 72);
            System.out.println("[SUCCESS] Created: " + validBogie);
        } catch (InvalidCapacityException e) {
            System.out.println("[ERROR] Failed to create bogie: " + e.getMessage());
        }

        // Test Case 2: Zero Capacity
        try {
            System.out.println("\nAttempting to create bogie with 0 capacity...");
            Bogie zeroBogie = new Bogie("AC Chair", 0);
        } catch (InvalidCapacityException e) {
            System.out.println("[CAUGHT EXPECTED ERROR] " + e.getMessage());
        }

        // Test Case 3: Negative Capacity
        try {
            System.out.println("\nAttempting to create bogie with -10 capacity...");
            Bogie negativeBogie = new Bogie("First Class", -10);
        } catch (InvalidCapacityException e) {
            System.out.println("[CAUGHT EXPECTED ERROR] " + e.getMessage());
        }
    }
}