import java.util.Scanner;

public class WelcomeUser {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Display the welcome message
        System.out.println("Welcome, " + name + "!");

        // Close the scanner
        scanner.close();
    }
}
