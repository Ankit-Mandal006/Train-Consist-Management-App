import java.util.LinkedHashSet;
import java.util.Set;

public class TrainApp {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        // UC5: Using LinkedHashSet for unique, ordered train formation
        Set<String> trainFormation = new LinkedHashSet<>();

        // Attaching bogies in specific order
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        System.out.println("\nInitial Formation (Order Preserved): " + trainFormation);

        // Attempting to add a duplicate bogie
        System.out.println("\n--- Attempting to attach duplicate: Sleeper ---");
        boolean isAdded = trainFormation.add("Sleeper");

        if (!isAdded) {
            System.out.println("Duplicate detected! 'Sleeper' was not added again.");
        }

        // Final display showing order is maintained and uniqueness is enforced
        System.out.println("\nFinal Train Formation: " + trainFormation);
        System.out.println("Total unique units in formation: " + trainFormation.size());
    }
}