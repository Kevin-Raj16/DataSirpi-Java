// Class to check and display the data type of given values
public class DataTypeChecker {

    // Method that accepts any type of data using Object
    public static void checkType(Object value) {

        // Checking for Byte type
        if (value instanceof Byte) {
            System.out.println(value + " → byte");
        }

        // Checking for Short type
        else if (value instanceof Short) {
            System.out.println(value + " → short");
        }

        // Checking for Integer type
        else if (value instanceof Integer) {
            System.out.println(value + " → int");
        }

        // Checking for Long type
        else if (value instanceof Long) {
            System.out.println(value + " → long");
        }

        // Checking for Float type
        else if (value instanceof Float) {
            System.out.println(value + " → float");
        }

        // Checking for Double type
        else if (value instanceof Double) {
            System.out.println(value + " → double");
        }

        // Checking for Character type
        else if (value instanceof Character) {
            System.out.println(value + " → char");
        }

        // Checking for Boolean type
        else if (value instanceof Boolean) {
            System.out.println(value + " → boolean");
        }

        // Checking for String (Non-primitive type)
        else if (value instanceof String) {
            System.out.println(value + " → String");
        }

        // Checking for integer array
        else if (value instanceof int[]) {
            System.out.println("Array → int[]");
        }

        // If type does not match any above
        else {
            System.out.println(value + " → Unknown Type");
        }
    }

    // Main method - entry point of the program
    public static void main(String[] args) {

        // ===== Primitive Data Types (Autoboxing happens here) =====
        // Java automatically converts primitive values into wrapper objects

        checkType((byte)10);      // byte
        checkType((short)200);    // short
        checkType(1000);          // int
        checkType(100000L);       // long
        checkType(5.5f);          // float
        checkType(10.99);         // double
        checkType('A');           // char
        checkType(true);          // boolean

        // ===== Non-Primitive Data Types =====

        checkType("Kevin");       // String

        // Array example
        checkType(new int[]{1, 2, 3});  // int array
    }
}
