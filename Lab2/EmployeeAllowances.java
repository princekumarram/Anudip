import java.util.Scanner;

public class EmployeeAllowances {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the salary from the user
        System.out.print("Enter the salary of the employee: ");
        double salary = scanner.nextDouble();

        // Calculating the allowances
        double da = (12 * salary) / 100; // DA is 12% of salary
        double hra = (13 * salary) / 100; // HRA is 13% of salary
        double pf = (15 * salary) / 100; // PF is 15% of salary
        double grossSalary = salary + da + hra + pf; // Gross salary is salary + all allowances

        // Printing the details
        System.out.println("\nEmployee Allowances and Salary Breakdown:");
        System.out.printf("DA (12%%): %.2f\n", da);
        System.out.printf("HRA (13%%): %.2f\n", hra);
        System.out.printf("PF (15%%): %.2f\n", pf);
        System.out.printf("Gross Salary: %.2f\n", grossSalary);

        scanner.close();
    }
}
