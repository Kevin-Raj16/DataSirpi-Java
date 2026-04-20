// Real-world example: Discount eligibility
public class TernaryExample {
    public static void main(String[] args) {

        int purchaseAmount = 1200;

        String result = (purchaseAmount > 1000) ? "Discount Applied" : "No Discount";

        System.out.println(result);
    }
}
