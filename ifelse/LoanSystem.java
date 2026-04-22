/**
 * LoanSystem
 * -----------------------------------
 * This program checks loan eligibility
 * based on salary and credit score.
 */
public class LoanSystem {

    /**
     * Method to check loan eligibility
     * @param salary User salary
     * @param creditScore User credit score
     * @return approval result
     */
    public static String checkEligibility(int salary, int creditScore) {

        if (salary >= 25000 && creditScore >= 700) {
            return "Loan Approved";
        } else {
            return "Loan Rejected";
        }
    }

    public static void main(String[] args) {
        int salary = 30000;
        int creditScore = 720;

        String result = checkEligibility(salary, creditScore);

        System.out.println("Result: " + result);
    }
}
