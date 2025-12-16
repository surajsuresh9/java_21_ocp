package java21.oops.inheritance.super_keyword;

public class Car {
    boolean isAutomatic = false;

    Car() {
        System.out.println("Car default constructor");
    }

    public void accelerate() {
        System.out.println("Car accelerating");
    }

    public void speed() {
        System.out.println("Car reaches 100 speed");
    }

    public void display() {
        accelerate();
        speed();
    }
}
