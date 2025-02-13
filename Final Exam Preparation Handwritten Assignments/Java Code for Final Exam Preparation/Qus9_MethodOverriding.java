// Superclass
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass overriding the method
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

public class Qus9_MethodOverriding {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        myAnimal.makeSound(); // Output: Animal makes a sound

        Animal myDog = new Dog(); // Upcasting
        myDog.makeSound(); // Output: Dog barks (Overridden method is called)
    }
}
