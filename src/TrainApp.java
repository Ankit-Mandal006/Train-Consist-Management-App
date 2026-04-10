import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TrainApp {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");
        System.out.println("--- Input Format Validation ---");

        // 1. Define Regex Patterns
        // TRN- followed by exactly 4 digits
        String trainIdRegex = "TRN-\\d{4}";
        // PET- followed by exactly 2 uppercase letters
        String cargoCodeRegex = "PET-[A-Z]{2}";

        // 2. Sample Inputs for Testing
        String[] testTrainIds = {"TRN-1234", "TRAIN12", "TRN-123", "TRN-12345"};
        String[] testCargoCodes = {"PET-AB", "PET-ab", "PET-12", "PET-XYZ"};

        // 3. Validate Train IDs
        System.out.println("\nValidating Train IDs (Format: TRN-xxxx):");
        Pattern trainPattern = Pattern.compile(trainIdRegex);
        for (String id : testTrainIds) {
            Matcher matcher = trainPattern.matcher(id);
            if (matcher.matches()) {
                System.out.println("[VALID]   " + id);
            } else {
                System.out.println("[INVALID] " + id + " -> Must be TRN- followed by 4 digits.");
            }
        }

        // 4. Validate Cargo Codes
        System.out.println("\nValidating Cargo Codes (Format: PET-XX):");
        Pattern cargoPattern = Pattern.compile(cargoCodeRegex);
        for (String code : testCargoCodes) {
            Matcher matcher = cargoPattern.matcher(code);
            if (matcher.matches()) {
                System.out.println("[VALID]   " + code);
            } else {
                System.out.println("[INVALID] " + code + " -> Must be PET- followed by 2 uppercase letters.");
            }
        }
    }
}