public class StudentMarksheet {

    public static void calculateMarksheet(String studentName, int subject1, int subject2, int subject3) {
        // Calculate total marks
        int totalMarks = subject1 + subject2 + subject3;

        // Calculate percentage
        double percentage = (totalMarks / 3.0);

        // Determine grade
        String grade;
        if (percentage >= 90) {
            grade = "A";
        } else if (percentage >= 75) {
            grade = "B";
        } else if (percentage >= 50) {
            grade = "C";
        } else {
            grade = "Fail";
        }

        // Determine pass/fail status
        boolean isPassed = (subject1 >= 50 && subject2 >= 50 && subject3 >= 50);
        String passFailStatus = isPassed ? "Pass" : "Fail";

        // Display marksheet
        System.out.println("Student Name: " + studentName);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
        System.out.println("Status: " + passFailStatus);
    }

    public static void main(String[] args) {
        // Example values
        String studentName = "John Doe";
        int subject1 = 85; // Subject 1 marks
        int subject2 = 78; // Subject 2 marks
        int subject3 = 90; // Subject 3 marks

        calculateMarksheet(studentName, subject1, subject2, subject3);
    }
}
