class Calculator {
    // Method to add two numbers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add three numbers
    public int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class Task1 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Call add method with two numbers
        System.out.println("Sum of 10 and 20: " + calculator.add(10, 20));

        // Call add method with three numbers
        System.out.println("Sum of 5, 15, and 25: " + calculator.add(5, 15, 25));
    }
}
