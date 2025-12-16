package java21.oops.inheritance.method_overriding;

public class Vehicle {
    void start() {
        System.out.println("Vehicle has started");
    }

    void stop() {
        System.out.println("Vehicle has stopped");
    }

    void accelerate(int speed) {
        System.out.println("Vehicle accelerates at " + speed);
    }
}
