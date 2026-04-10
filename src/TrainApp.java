import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TrainApp {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        // Create a list of Bogie objects
        List<Bogie> passengerBogies = new ArrayList<>();
        passengerBogies.add(new Bogie("Sleeper", 72));
        passengerBogies.add(new Bogie("AC Chair", 56));
        passengerBogies.add(new Bogie("First Class", 24));

        System.out.println("\n--- Before Sorting ---");
        passengerBogies.forEach(System.out::println);

        // Sort by capacity using Comparator and Lambda expression
        passengerBogies.sort(Comparator.comparingInt(Bogie::getCapacity));

        System.out.println("\n--- Sorted by Capacity (Low to High) ---");
        passengerBogies.forEach(System.out::println);
    }
}