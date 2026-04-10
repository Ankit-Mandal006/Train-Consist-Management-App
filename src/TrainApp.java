import java.util.ArrayList;
import java.util.List;

public class TrainApp {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");
        System.out.println("--- Safety Compliance Check ---");

        // 1. Prepare Goods Bogies
        List<GoodsBogie> goodsConsist = new ArrayList<>();
        goodsConsist.add(new GoodsBogie("Rectangular", "Coal"));
        goodsConsist.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goodsConsist.add(new GoodsBogie("Rectangular", "Grain"));

        // Uncomment the line below to test a safety violation:
        // goodsConsist.add(new GoodsBogie("Cylindrical", "Coal"));

        System.out.println("\nCurrent Consist for Inspection:");
        goodsConsist.forEach(System.out::println);

        // 2. Define Safety Rule:
        // IF type is Cylindrical, THEN cargo MUST be Petroleum.
        // For all other types, any cargo is allowed.
        boolean isSafe = goodsConsist.stream().allMatch(b -> {
            if (b.getType().equalsIgnoreCase("Cylindrical")) {
                return b.getCargo().equalsIgnoreCase("Petroleum");
            }
            return true; // Non-cylindrical bogies pass this specific rule
        });

        // 3. Display Result
        System.out.println("\n------------------------------------");
        if (isSafe) {
            System.out.println("STATUS: [SAFE]");
            System.out.println("All safety protocols met. Ready for departure.");
        } else {
            System.out.println("STATUS: [UNSAFE - VIOLATION DETECTED]");
            System.out.println("Emergency: Cylindrical bogies found with non-Petroleum cargo!");
        }
        System.out.println("------------------------------------");
    }
}