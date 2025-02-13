class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass overriding the method but also calling superclass method
class Dog extends Animal {
    @Override
    void makeSound() {
        super.makeSound(); // Calls the superclass method
        System.out.println("Dog barks");
    }
}

public class Qus9_SuperExample {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.makeSound();
    }
}
