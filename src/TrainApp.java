import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TrainApp {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");
        System.out.println("--- Performance Benchmarking: Loop vs Stream ---\n");

        // 1. Prepare a larger dataset for meaningful results
        List<Bogie> dataset = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            dataset.add(new Bogie("Bogie-" + i, (int) (Math.random() * 100)));
        }

        // 2. Measure Loop-Based Filtering
        long loopStart = System.nanoTime();
        List<Bogie> loopFiltered = new ArrayList<>();
        for (Bogie b : dataset) {
            if (b.getCapacity() > 60) {
                loopFiltered.add(b);
            }
        }
        long loopEnd = System.nanoTime();
        long loopDuration = loopEnd - loopStart;

        // 3. Measure Stream-Based Filtering
        long streamStart = System.nanoTime();
        List<Bogie> streamFiltered = dataset.stream()
                .filter(b -> b.getCapacity() > 60)
                .collect(Collectors.toList());
        long streamEnd = System.nanoTime();
        long streamDuration = streamEnd - streamStart;

        // 4. Display Results and Comparison
        System.out.println("Dataset Size: " + dataset.size() + " bogies");
        System.out.println("Loop Filtered Count: " + loopFiltered.size());
        System.out.println("Stream Filtered Count: " + streamFiltered.size());

        System.out.println("\nExecution Time Statistics:");
        System.out.println("Loop Execution Time   : " + loopDuration + " nanoseconds");
        System.out.println("Stream Execution Time : " + streamDuration + " nanoseconds");

        if (loopDuration < streamDuration) {
            System.out.println("\nResult: Traditional Loop was faster by " + (streamDuration - loopDuration) + " ns.");
        } else {
            System.out.println("\nResult: Stream API was faster by " + (loopDuration - streamDuration) + " ns.");
        }
    }
}