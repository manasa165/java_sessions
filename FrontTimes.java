public class FrontTimes {
    public static void main(String[] args) {
        FrontTimes obj = new FrontTimes();
        String output = obj.frontTimes("Chocolate", 3);
        System.out.println(output); // Expected output: "ChoChoCho"
    }

    public String frontTimes(String str, int n) {
        String result = "";
        int end = 3;
        if (str.length() < 3) {
            end = str.length();
        }
        String front = str.substring(0, end);
        for (int i = 0; i < n; i++) {
            result = result + front; // Correct concatenation order
        }
        return result;
    }
}
