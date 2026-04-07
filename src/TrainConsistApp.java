import java.util.Arrays;
import java.util.Scanner;

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println(" UC19 - Binary Search for Bogie ID ");
        System.out.println("=====================================\n");

        // Array of bogie IDs (can be unsorted initially)
        String[] bogieIDs = {"BG309", "BG101", "BG550", "BG205", "BG412"};

        // 🔹 Sort before binary search (IMPORTANT)
        Arrays.sort(bogieIDs);

        // Display sorted array
        System.out.println("Sorted Bogie IDs:");
        System.out.println(Arrays.toString(bogieIDs));

        // Input search key
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter Bogie ID to search: ");
        String key = sc.nextLine();

        // 🔹 Binary Search
        int low = 0;
        int high = bogieIDs.length - 1;
        boolean found = false;

        while (low <= high) {

            int mid = (low + high) / 2;

            int compare = key.compareTo(bogieIDs[mid]);

            if (compare == 0) {
                System.out.println("Bogie Found at position: " + mid);
                found = true;
                break;
            } else if (compare < 0) {
                high = mid - 1; // search left
            } else {
                low = mid + 1; // search right
            }
        }

        // If not found
        if (!found) {
            System.out.println("Bogie ID not found.");
        }

        sc.close();
    }
}