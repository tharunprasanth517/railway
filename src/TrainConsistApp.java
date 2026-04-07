import java.util.*;

// Custom Runtime Exception
class CargoSafetyException extends RuntimeException {
    public CargoSafetyException(String message) {
        super(message);
    }
}

// Goods Bogie class
class GoodsBogie {
    String type;
    String cargo;

    GoodsBogie(String type) {
        this.type = type;
    }

    // Method to assign cargo safely
    void assignCargo(String cargo) {
        try {
            // Unsafe condition
            if (type.equals("Rectangular") && cargo.equals("Petroleum")) {
                throw new CargoSafetyException("Unsafe: Rectangular bogie cannot carry Petroleum!");
            }

            // Safe assignment
            this.cargo = cargo;
            System.out.println(type + " bogie assigned cargo: " + cargo);

        } catch (CargoSafetyException e) {
            System.out.println("Error: " + e.getMessage());

        } finally {
            System.out.println("Cargo assignment attempt completed.\n");
        }
    }
}

// Main class
public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println(" UC15 - Safe Cargo Assignment ");
        System.out.println("=====================================\n");

        // Create bogies
        GoodsBogie b1 = new GoodsBogie("Cylindrical");
        GoodsBogie b2 = new GoodsBogie("Rectangular");

        // Safe assignment
        b1.assignCargo("Petroleum");

        // Unsafe assignment
        b2.assignCargo("Petroleum");

        // Program continues
        System.out.println("Program continues safely...");
    }
}