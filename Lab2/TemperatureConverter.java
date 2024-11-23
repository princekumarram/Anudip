import java.util.Scanner;

public class TemperatureConverter {

    // Method to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return ((celsius * 9) / 5) + 32;
    }

    // Method to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return ((fahrenheit - 32) * 5) / 9;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Temperature Converter");

        // Asking the user for the type of conversion they want
        System.out.print("Enter the type of conversion (1 for Celsius to Fahrenheit, 2 for Fahrenheit to Celsius): ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            // Celsius to Fahrenheit
            System.out.print("Enter temperature in Celsius: ");
            double celsius = scanner.nextDouble();
            double fahrenheit = celsiusToFahrenheit(celsius);
            System.out.printf("%.2f Celsius is %.2f Fahrenheit%n", celsius, fahrenheit);
        } else if (choice == 2) {
            // Fahrenheit to Celsius
            System.out.print("Enter temperature in Fahrenheit: ");
            double fahrenheit = scanner.nextDouble();
            double celsius = fahrenheitToCelsius(fahrenheit);
            System.out.printf("%.2f Fahrenheit is %.2f Celsius%n", fahrenheit, celsius);
        } else {
            System.out.println("Invalid choice! Please select either 1 or 2.");
        }

        scanner.close();
    }
}
