import java.util.LinkedList;

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create LinkedList for train consist
        LinkedList<String> consist = new LinkedList<>();

        // Add bogies
        consist.add("Engine");
        consist.add("Sleeper");
        consist.add("AC");
        consist.add("Cargo");
        consist.add("Guard");

        System.out.println("\nInitial Train Consist:");
        System.out.println(consist);

        // Insert Pantry Car at position 2 (index starts from 0)
        consist.add(2, "Pantry Car");

        System.out.println("\nAfter adding Pantry Car at position 2:");
        System.out.println(consist);

        // Remove first and last bogie
        consist.removeFirst();
        consist.removeLast();

        System.out.println("\nAfter removing first and last bogies:");
        System.out.println(consist);

        // Final consist
        System.out.println("\nFinal Train Consist:");
        System.out.println(consist);
    }
}