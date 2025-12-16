package java21.oops.inheritance.method_overriding;

public class Test {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.start();
        vehicle.accelerate(20);
        vehicle.stop();
        System.out.println("=====================");
        Car car = new Car();
        car.start();
        car.accelerate(100);
        car.stop();
    }
}
