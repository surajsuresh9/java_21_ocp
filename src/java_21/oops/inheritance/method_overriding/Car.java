package java21.oops.inheritance.method_overriding;

public class Car extends Vehicle {
    @Override
    void start() {
        super.start();
        System.out.println("Car has started");
    }

    @Override
    protected void stop() {
        super.stop();
        System.out.println("Car has stopped");
    }

    @Override
    void accelerate(int speed) {
        System.out.println("Car accelerates at " + speed);
    }
}
