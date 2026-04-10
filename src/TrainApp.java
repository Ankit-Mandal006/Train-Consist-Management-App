public class TrainApp {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");
        System.out.println("--- Cargo Assignment Safety Monitor ---\n");

        GoodsBogie rectangularBogie = new GoodsBogie("Rectangular");
        GoodsBogie cylindricalBogie = new GoodsBogie("Cylindrical");

        // Scenario 1: Safe Assignment
        processCargoAssignment(cylindricalBogie, "Petroleum");

        // Scenario 2: Unsafe Assignment
        processCargoAssignment(rectangularBogie, "Petroleum");

        System.out.println("\nApplication state: Operational. System continuing...");
    }

    public static void processCargoAssignment(GoodsBogie bogie, String cargo) {
        System.out.println("Attempting to assign " + cargo + " to " + bogie.getShape() + " bogie...");

        try {
            bogie.assignCargo(cargo);
        } catch (CargoSafetyException e) {
            System.err.println("[ALERT] " + e.getMessage());
        } finally {
            System.out.println("[SYSTEM LOG] Safety check completed for " + bogie.getShape() + " unit.");
        }
        System.out.println("----------------------------------------------");
    }
}