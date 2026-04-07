public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println(" UC20 - Exception Handling in Search ");
        System.out.println("=====================================\n");

        // 🔹 Bogie array (empty scenario)
        String[] bogieIDs = {};

        // Search key
        String searchId = "BG101";

        try {
            // 🔹 Fail-fast validation
            if (bogieIDs.length == 0) {
                throw new IllegalStateException("No bogies available for search!");
            }

            // 🔹 Linear Search (only runs if data exists)
            boolean found = false;

            for (String id : bogieIDs) {
                if (id.equals(searchId)) {
                    found = true;
                    break;
                }
            }

            // Display result
            if (found) {
                System.out.println("Bogie Found!");
            } else {
                System.out.println("Bogie Not Found.");
            }

        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\nUC20 execution completed...");
    }
}