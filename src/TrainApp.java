import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TrainApp {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        // Initializing the list with various passenger bogies
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("Sleeper-Economy", 80));

        System.out.println("\nFull Train Consist:");
        bogies.forEach(System.out::println);

        // UC8: Filtering bogies with capacity > 60 using Stream API
        List<Bogie> highCapacityBogies = bogies.stream()
                .filter(b -> b.getCapacity() > 60)
                .collect(Collectors.toList());

        System.out.println("\n--- High Capacity Bogies ( > 60 seats) ---");
        if (highCapacityBogies.isEmpty()) {
            System.out.println("No bogies match the criteria.");
        } else {
            highCapacityBogies.forEach(System.out::println);
        }

        // Verification of Original Collection Integrity
        System.out.println("\nOriginal list size remains: " + bogies.size());
    }
}