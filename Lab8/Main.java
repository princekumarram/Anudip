import java.util.*;

interface Person {
    void speak(); // Abstract method
}

// Implementing the Person interface in the Student class
class Student implements Person {
    @Override
    public void speak() {
        System.out.println("Hello, I am a Student. I love learning!");
    }
}

// Implementing the Person interface in the Teacher class
class Teacher implements Person {
    @Override
    public void speak() {
        System.out.println("Hello, I am a Teacher. I enjoy teaching!");
    }
}

// Main class to test the implementation
public class Main {
    public static void main(String[] args) {
        // Creating a Student object
        Person student = new Student();
        student.speak(); // Calls the Student's speak method

        // Creating a Teacher object
        Person teacher = new Teacher();
        teacher.speak(); // Calls the Teacher's speak method
    }
}
