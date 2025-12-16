
package java21.oops.abstraction.abstract_classes;

public abstract class Animal {
    String name;

    public Animal() {
        System.out.println("Animal default constructor");
    }

    Animal(String name) {
        this.name = name;
    }

    abstract void makeSound(); // Abstract method

    void eat() { // Concrete method
        System.out.println(name + " is eating.");
    }
}
