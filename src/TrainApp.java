public class TrainApp {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");
        System.out.println("--- Bubble Sort: Capacity Ordering ---\n");

        // 1. Initialize array of passenger bogie capacities
        int[] capacities = {72, 56, 24, 70, 60};

        System.out.print("Before Sorting: ");
        printArray(capacities);

        // 2. Bubble Sort Logic
        int n = capacities.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // Swap if the element found is greater than the next element
                if (capacities[j] > capacities[j + 1]) {
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                }
            }
        }

        System.out.print("After Sorting : ");
        printArray(capacities);
    }

    // Helper method to display array
    public static void printArray(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}