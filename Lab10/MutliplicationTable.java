package Lab10;

//1. Write a Java program to print the multiplication table of a given number using a loop.
public class MutliplicationTable {

    public static void funMultiplcationTable(int n) {

        for (int i = 1; i <= 10; i++) {
            int ans = n * i;
            System.out.print(ans + " ");
        }
    }

    public static void main(String[] args) {
        System.out.println("Try programiz.pro");

        int n = 3;
        funMultiplcationTable(n);

    }
}
