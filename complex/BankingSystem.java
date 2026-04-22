/**
 * BankingSystem
 * -----------------------------------
 * Features:
 * - Deposit
 * - Withdraw
 * - Balance check
 * - Fraud detection
 */
public class BankingSystem {

    private static int balance = 1000;

    /**
     * Deposit money into account
     */
    public static void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        }
    }

    /**
     * Withdraw money from account
     */
    public static void withdraw(int amount) {

        if (amount > balance) {
            System.out.println("Insufficient balance");
        } else if (amount > 5000) {
            System.out.println("Large transaction flagged!");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }

    /**
     * Display balance
     */
    public static void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {

        deposit(2000);
        withdraw(1500);
        withdraw(7000); // fraud check
        checkBalance();
    }
}
