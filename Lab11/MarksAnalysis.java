import java.util.Scanner;

public class MarksAnalysis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] marks = new int[12];

        System.out.println("Enter the marks of 12 students:");
        for (int i = 0; i < 12; i++) {
            marks[i] = scanner.nextInt();
        }

        int highest = marks[0];
        int lowest = marks[0];

        for (int mark : marks) {
            if (mark > highest) {
                highest = mark;
            }
            if (mark < lowest) {
                lowest = mark;
            }
        }

        System.out.println("Highest mark: " + highest);
        System.out.println("Lowest mark: " + lowest);

        scanner.close();
    }
}
