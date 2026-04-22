/**
 * OrderProcessing
 * -----------------------------------
 * Simulates processing of orders and calculates:
 * - total revenue
 * - high value orders
 */
public class OrderProcessing {

    /**
     * Calculate total revenue
     */
    public static int calculateTotal(int[] orders) {
        int total = 0;

        for (int order : orders) {
            total += order;
        }

        return total;
    }

    /**
     * Count high value orders (> 500)
     */
    public static int countHighValue(int[] orders) {
        int count = 0;

        for (int order : orders) {
            if (order > 500) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        int[] orders = {200, 800, 1200, 400, 900};

        int total = calculateTotal(orders);
        int highValue = countHighValue(orders);

        System.out.println("Total Revenue: " + total);
        System.out.println("High Value Orders: " + highValue);
    }
}
