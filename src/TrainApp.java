import java.util.LinkedList;

public class TrainApp {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        // UC4: Using LinkedList to maintain physical train sequence
        LinkedList<String> trainConsist = new LinkedList<>();

        // Adding bogies (Initial chain)
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        System.out.println("Initial Train Consist: " + trainConsist);

        // Insert a Pantry Car at position 2 (index 2)
        trainConsist.add(2, "Pantry Car");
        System.out.println("After adding Pantry Car: " + trainConsist);

        // Remove the first (Engine) and last (Guard) bogies
        trainConsist.removeFirst();
        trainConsist.removeLast();

        System.out.println("Final Ordered Train Consist: " + trainConsist);
    }
}