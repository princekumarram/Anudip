// Base class Animal
class Animal {
    public void makeSound() {
        System.out.println("Animal sound");
    }
}

// Dog class extending Animal
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }
}

// Cat class extending Animal
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}

public class Task2 {
    public static void main(String[] args) {
        // Dog object
        Animal dog = new Dog();
        dog.makeSound(); // Output: Bark

        // Cat object
        Animal cat = new Cat();
        cat.makeSound(); // Output: Meow
    }
}
