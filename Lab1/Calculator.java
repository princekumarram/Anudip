public class Calculator {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide two numbers as arguments.");
            return;
        }

        try {
            // Parse the command line arguments to numbers
            double num1 = Double.parseDouble(args[0]);
            double num2 = Double.parseDouble(args[1]);

            // Perform operations
            double addition = num1 + num2;
            double subtraction = num1 - num2;
            double multiplication = num1 * num2;
            double division = num2 != 0 ? num1 / num2 : Double.NaN; // Prevent division by zero

            // Display results
            System.out.println("Addition: " + addition);
            System.out.println("Subtraction: " + subtraction);
            System.out.println("Multiplication: " + multiplication);
            System.out.println("Division: " + (num2 != 0 ? division : "undefined (cannot divide by zero)"));
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please provide numeric values.");
        }
    }
}
