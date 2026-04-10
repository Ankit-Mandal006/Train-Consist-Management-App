import java.util.Arrays;

public class TrainApp {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");
        System.out.println("--- Library-Based Sorting: Bogie Types ---\n");

        // 1. Initialize an unsorted array of bogie type names
        String[] bogieTypes = {"Sleeper", "AC Chair", "First Class", "General", "Luxury"};

        System.out.println("Before Sorting: " + Arrays.toString(bogieTypes));

        // 2. Use Java's built-in optimized sorting utility
        // This handles alphabetical order (Natural Ordering) automatically
        Arrays.sort(bogieTypes);

        // 3. Display the sorted result
        System.out.println("After Sorting : " + Arrays.toString(bogieTypes));

        // Demonstrating duplicate handling
        String[] duplicates = {"Sleeper", "AC Chair", "Sleeper", "General"};
        Arrays.sort(duplicates);
        System.out.println("\nDuplicate Handling Example: " + Arrays.toString(duplicates));
    }
}