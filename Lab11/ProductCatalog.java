import java.util.Scanner;

public class ProductCatalog {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] products = { "Laptop", "Mouse", "Keyboard", "Monitor", "Printer" };

        System.out.println("Enter the product name to search:");
        String searchProduct = scanner.nextLine();

        boolean found = false;
        for (String product : products) {
            if (product.equalsIgnoreCase(searchProduct)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Product " + searchProduct + " is available.");
        } else {
            System.out.println("Product " + searchProduct + " is not available.");
        }

        scanner.close();
    }
}
