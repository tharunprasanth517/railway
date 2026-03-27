import java.util.ArrayList;
import java.util.List;

// Main class
public class TrainConsistApp {

    // 🔹 Custom Exception
    static class InvalidCapacityException extends Exception {
        public InvalidCapacityException(String message) {
            super(message);
        }
    }

    // 🔹 Passenger Bogie class with validation
    static class PassengerBogie {
        String name;
        int capacity;

        PassengerBogie(String name, int capacity) throws InvalidCapacityException {
            if (capacity <= 0) {
                throw new InvalidCapacityException("Capacity must be greater than zero");
            }
            this.name = name;
            this.capacity = capacity;
        }

        @Override
        public String toString() {
            return name + " → Capacity: " + capacity;
        }
    }

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println(" UC14 - Custom Exception Handling ");
        System.out.println("=====================================\n");

        List<PassengerBogie> bogies = new ArrayList<>();

        try {
            // Valid bogie
            bogies.add(new PassengerBogie("Sleeper", 72));

            // Invalid bogie (will throw exception)
            bogies.add(new PassengerBogie("AC Chair", -10));

        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Display valid bogies
        System.out.println("\nValid Bogies in Train:");
        for (PassengerBogie b : bogies) {
            System.out.println(b);
        }
    }
}