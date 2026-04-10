import java.util.ArrayList;
import java.util.List;

public class TrainApp {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        // Initializing the list with various passenger bogies
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("Sleeper-Economy", 80));

        System.out.println("\nAnalyzing Train Capacity...");
        bogies.forEach(b -> System.out.println("Adding: " + b));

        // UC10: Aggregate seating capacities using map() and reduce()
        // map() transforms Bogie objects into Integers
        // reduce() sums them up starting from an identity of 0
        int totalSeats = bogies.stream()
                .map(Bogie::getCapacity)
                .reduce(0, Integer::sum);

        System.out.println("\n------------------------------------");
        System.out.println("TOTAL SEATING CAPACITY: " + totalSeats);
        System.out.println("------------------------------------");

        // Verification of Original Collection Integrity
        System.out.println("Original bogie list remains intact. Total bogies: " + bogies.size());
    }
}