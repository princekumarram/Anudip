import java.util.Scanner;

public class Square {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the side length from the user
        System.out.print("Enter the side length of the square: ");
        double side = scanner.nextDouble();

        // Calculating the perimeter and area
        double perimeter = 4 * side; // Perimeter formula: 4 * side
        double area = side * side; // Area formula: side * side

        // Printing the results
        System.out.printf("Perimeter of the square: %.2f\n", perimeter);
        System.out.printf("Area of the square: %.2f\n", area);

        scanner.close();
    }
}
