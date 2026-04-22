/**
 * TransactionProcessor
 * -----------------------------------
 * Handles transactions:
 * - skips invalid transactions
 * - stops processing if fraud detected
 */
public class TransactionProcessor {

    public static void processTransactions(int[] transactions) {

        int total = 0;

        for (int t : transactions) {

            // Skip invalid transaction
            if (t < 0) {
                System.out.println("Invalid transaction skipped: " + t);
                continue;
            }

            // Stop if suspicious large transaction
            if (t > 10000) {
                System.out.println("Fraud detected! Stopping process.");
                break;
            }

            total += t;
        }

        System.out.println("Processed Total: " + total);
    }

    public static void main(String[] args) {
        int[] transactions = {500, -200, 3000, 15000, 700};

        processTransactions(transactions);
    }
}
