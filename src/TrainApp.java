import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TrainApp {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        // Initializing the list with multiple bogies of the same and different types
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("AC Chair", 56));

        // UC9: Grouping bogies by their type (name) using Collectors.groupingBy
        Map<String, List<Bogie>> groupedBogies = bogies.stream()
                .collect(Collectors.groupingBy(Bogie::getName));

        System.out.println("\n--- Bogies Grouped by Type ---");
        groupedBogies.forEach((type, bogieList) -> {
            System.out.println("Category: " + type + " | Count: " + bogieList.size());
            bogieList.forEach(b -> System.out.println("  -> " + b));
        });

        // Verification of Original Collection Integrity
        System.out.println("\nOriginal list remains untouched. Size: " + bogies.size());
    }
}