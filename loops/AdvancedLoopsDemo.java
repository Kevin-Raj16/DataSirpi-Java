/**
 * AdvancedLoopsDemo
 * -----------------------------------------
 * Demonstrates all loop types in Java:
 * - for loop
 * - while loop
 * - do-while loop
 * - enhanced for loop
 *
 * Real-world scenarios:
 * - Order processing
 * - Login attempts
 * - Menu system
 * - Data iteration
 */
public class AdvancedLoopsDemo {

    /**
     * FOR LOOP
     * Scenario: Process orders and calculate total revenue
     */
    public static void processOrders() {
        int[] orders = {200, 500, 1200, 700};

        int total = 0;

        for (int i = 0; i < orders.length; i++) {
            total += orders[i];
            System.out.println("Processing order: " + orders[i]);
        }

        System.out.println("Total Revenue: " + total);
    }

    /**
     * WHILE LOOP
     * Scenario: Limit login attempts
     */
    public static void loginSystem() {
        int attempts = 0;
        int maxAttempts = 3;

        while (attempts < maxAttempts) {
            System.out.println("Login attempt: " + (attempts + 1));
            attempts++;
        }

        System.out.println("Account locked after 3 attempts");
    }

    /**
     * DO-WHILE LOOP
     * Scenario: Menu-driven system (runs at least once)
     */
    public static void menuSystem() {
        int option = 1;

        do {
            System.out.println("Menu displayed once (at least)");
            option--;
        } while (option > 0);
    }

    /**
     * ENHANCED FOR LOOP (for-each)
     * Scenario: Iterate over product list
     */
    public static void displayProducts() {
        String[] products = {"Laptop", "Mobile", "Tablet"};

        for (String product : products) {
            System.out.println("Product: " + product);
        }
    }

    /**
     * NESTED LOOP (Advanced)
     * Scenario: Generate seating arrangement (rows & columns)
     */
    public static void seatingArrangement() {
        int rows = 3;
        int cols = 4;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                System.out.print("Seat[" + i + "," + j + "] ");
            }
            System.out.println();
        }
    }

    /**
     * Main method to execute all loop examples
     */
    public static void main(String[] args) {

        System.out.println("=== FOR LOOP ===");
        processOrders();

        System.out.println("\n=== WHILE LOOP ===");
        loginSystem();

        System.out.println("\n=== DO-WHILE LOOP ===");
        menuSystem();

        System.out.println("\n=== ENHANCED FOR LOOP ===");
        displayProducts();

        System.out.println("\n=== NESTED LOOP ===");
        seatingArrangement();
    }
}
