import java.util.*;

public class Person {
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

    // Main method to test the Person class
    public static void main(String[] args) {
        // Create a Person object
        Person person = new Person("John", 25);

        // Call the speak method
        person.speak();
    }
}
