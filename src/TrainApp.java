import java.util.Arrays;

public class TrainApp {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");
        System.out.println("--- Defensive Search Operations ---\n");

        // Scenario 1: Empty Train (Should fail fast)
        String[] emptyConsist = {};
        try {
            System.out.println("Attempting to search an empty train...");
            searchBogie(emptyConsist, "BG101");
        } catch (IllegalStateException e) {
            System.out.println("[GUARD] " + e.getMessage());
        }

        System.out.println("----------------------------------------------");

        // Scenario 2: Formed Train (Should proceed normally)
        String[] formedConsist = {"BG101", "BG205", "BG309"};
        try {
            System.out.println("Attempting to search a formed train...");
            boolean found = searchBogie(formedConsist, "BG205");
            System.out.println("Bogie BG205 Found: " + found);
        } catch (IllegalStateException e) {
            System.out.println("[GUARD] Error: " + e.getMessage());
        }
    }

    /**
     * Searches for a bogie ID but validates the state of the collection first.
     * @throws IllegalStateException if the consist array is null or empty.
     */
    public static boolean searchBogie(String[] consist, String targetId) {
        // Defensive Check: State Validation
        if (consist == null || consist.length == 0) {
            throw new IllegalStateException("Search Denied: The train consist has not been formed yet.");
        }

        // Proceeding with standard Linear Search if state is valid
        for (String id : consist) {
            if (id.equals(targetId)) {
                return true;
            }
        }
        return false;
    }
}