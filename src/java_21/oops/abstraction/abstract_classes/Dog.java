
package java21.oops.abstraction.abstract_classes;

public class Dog extends Animal {
    String name;

    public Dog() {
        System.out.println("Dog default constructor");
    }

    Dog(String name) {
        this.name = name;
    }

    void makeSound() {
        System.out.println("bark bark");
    }

    void eat() { // Concrete method
        System.out.println(name + " is eating.");
    }
}
