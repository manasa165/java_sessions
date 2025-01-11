public class Main {
    // Method to check the range
    public static boolean in1To10(int n, boolean outsideMode) {
        if (outsideMode) {
            return n <= 1 || n >= 10;
        } else {
            return n >= 1 && n <= 10;
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        // Test cases
        System.out.println(in1To10(5, false));  // true
        System.out.println(in1To10(11, false)); // false
        System.out.println(in1To10(11, true));  // true
    }
}