import java.util.Scanner;

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println(" UC18 - Linear Search for Bogie ID ");
        System.out.println("=====================================\n");

        // Array of bogie IDs
        String[] bogieIDs = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        // Take input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Bogie ID to search: ");
        String searchKey = sc.nextLine();

        // 🔹 Linear Search
        boolean found = false;

        for (int i = 0; i < bogieIDs.length; i++) {
            if (bogieIDs[i].equals(searchKey)) {
                found = true;
                System.out.println("Bogie Found at position: " + i);
                break; // stop when found
            }
        }

        // If not found
        if (!found) {
            System.out.println("Bogie ID not found.");
        }

        sc.close();
    }
}