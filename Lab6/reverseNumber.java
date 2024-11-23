import java.util.*;

class reverseNumber {

    public static int getReverse(int num) {

        int reverse = 0;
        while (num != 0) {
            int remainder = num % 10;
            reverse = reverse * 10 + remainder;
            num = num / 10;
        }
        return reverse;
    }

    public static void main(String args[]) {
        int num = 12345;

        int ans = getReverse(num);

        System.out.println("Reverse of the number is: " + ans);

    }
}