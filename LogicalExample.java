// Real-world example: Login validation
public class LogicalExample {
    public static void main(String[] args) {

        boolean isEmailValid = true;
        boolean isPasswordValid = false;

        boolean canLogin = isEmailValid && isPasswordValid;

        System.out.println("Login Success: " + canLogin);
    }
}
