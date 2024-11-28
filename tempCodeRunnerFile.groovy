// Define the Person class
class Person {
    // Attributes
    private String name;
    private int age;

    // Constructor to initialize name and age
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display the person's details
    public void speak() {
        System.out.println("My name is " + name + " and I am " + age + " years old.");
    }
}

// Define the Student class that inherits from Person
class Student extends Person {
    // Additional attribute
    private int grade;

    // Constructor to initialize name, age, and grade
    public Student(String name, int age, int grade) {
        super(name, age); // Call the constructor of the Person class
        this.grade = grade;
    }

    // Method to display study details
    public void study() {
        System.out.println("I am studying for grade: " + grade + ".");
    }
}

// Main class to execute the program
public class Main {
    public static void main(String[] args) {
        // Create a Student object
        Student student = new Student("Alice", 20, 10);

        // Call the methods
        student.speak(); // From Person class
        student.study(); // From Student class
    }
}
