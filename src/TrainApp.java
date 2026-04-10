public class TrainApp {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");
        System.out.println("--- Linear Search: Locating Bogie ID ---\n");

        // 1. Initialize an array of unsorted bogie IDs
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        // 2. Define search keys (one existing, one missing)
        String searchKey1 = "BG309";
        String searchKey2 = "BG999";

        // 3. Execute searches
        performLinearSearch(bogieIds, searchKey1);
        performLinearSearch(bogieIds, searchKey2);
    }

    /**
     * Performs a Linear Search on the provided array.
     */
    public static void performLinearSearch(String[] ids, String key) {
        boolean found = false;
        int position = -1;

        System.out.println("Searching for Bogie ID: " + key + "...");

        // Sequential Traversal
        for (int i = 0; i < ids.length; i++) {
            // Using .equals() for safe string comparison
            if (ids[i].equals(key)) {
                found = true;
                position = i;
                break; // Early Termination: stop as soon as we find it
            }
        }

        if (found) {
            System.out.println("[SUCCESS] Bogie " + key + " found at position: " + (position + 1));
        } else {
            System.out.println("[NOT FOUND] Bogie " + key + " does not exist in the consist.");
        }
        System.out.println("----------------------------------------------");
    }
}