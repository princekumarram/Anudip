public class OddEvenChecker {

    public static String checkOddEven(int number) {
        if (number % 2 == 0) {
            return number + " is Even.";
        } else {
            return number + " is Odd.";
        }
    }

    public static void main(String[] args) {
        int testNumber = 7; // Example value
        System.out.println(checkOddEven(testNumber));
    }
}
