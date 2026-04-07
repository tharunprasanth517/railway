public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println(" UC16 - Bubble Sort (Manual Sorting) ");
        System.out.println("=====================================\n");

        // Array of passenger bogie capacities
        int[] capacities = {72, 56, 24, 70, 60};

        // Display original array
        System.out.print("Original Capacities: ");
        printArray(capacities);

        // 🔹 Bubble Sort
        int n = capacities.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {

                // Compare adjacent elements
                if (capacities[j] > capacities[j + 1]) {

                    // Swap
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                }
            }
        }

        // Display sorted array
        System.out.print("Sorted Capacities: ");
        printArray(capacities);
    }

    // Helper method to print array
    static void printArray(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}