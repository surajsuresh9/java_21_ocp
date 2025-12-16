
package java21.oops.inheritance.super_keyword;

public class Ferrari extends Car {
    boolean isAutomatic = true;

    void printGear() {
        System.out.println(isAutomatic);
        System.out.println(super.isAutomatic);
    }

    Ferrari() {
        System.out.println("Ferrari default constructor");
    }

    public void accelerate() {
        System.out.println("Ferrari accelerating");
    }

    public void speed() {
        System.out.println("Ferrari reaches 200 speed");
    }

    public void display() {
        accelerate();
        speed();
        super.accelerate();
        super.speed();
    }
}
