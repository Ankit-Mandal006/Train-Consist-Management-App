import java.util.Arrays;

public class TrainApp {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");
        System.out.println("--- Binary Search: Optimized ID Lookup ---\n");

        // 1. Initial Data (Unsorted to test the precondition)
        String[] bogieIds = {"BG309", "BG101", "BG550", "BG205", "BG412"};

        // 2. PRECONDITION: Data must be sorted for Binary Search to work
        Arrays.sort(bogieIds);
        System.out.println("Sorted Consist IDs: " + Arrays.toString(bogieIds));

        // 3. Define search keys
        String targetFound = "BG205";
        String targetNotFound = "BG999";

        // 4. Perform Searches
        executeBinarySearch(bogieIds, targetFound);
        executeBinarySearch(bogieIds, targetNotFound);
    }

    public static void executeBinarySearch(String[] arr, String key) {
        int low = 0;
        int high = arr.length - 1;
        int position = -1;
        boolean found = false;

        System.out.println("\nSearching for: " + key);

        while (low <= high) {
            int mid = low + (high - low) / 2; // Prevents potential integer overflow

            // compareTo() returns 0 if strings are equal
            int comparison = key.compareTo(arr[mid]);

            if (comparison == 0) {
                found = true;
                position = mid;
                break; // Found the bogie!
            } else if (comparison > 0) {
                low = mid + 1; // Target is in the right half
            } else {
                high = mid - 1; // Target is in the left half
            }
        }

        if (found) {
            System.out.println("[SUCCESS] Bogie " + key + " located at sorted index: " + position);
        } else {
            System.out.println("[NOT FOUND] Bogie " + key + " is not in the system.");
        }
    }
}