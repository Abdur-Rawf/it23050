// Abstraction using Abstract Class
abstract class Vehicle {
    abstract void start(); // Abstract method
}

class Car extends Vehicle {
    void start() { System.out.println("Car starts with a key!"); }
}

// Encapsulation Example
class Person {
    private String name; // Private variable
    void setName(String n) { name = n; } // Setter
    String getName() { return name; } // Getter
}
