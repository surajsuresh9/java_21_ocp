package java21.oops.abstraction.encapsulation;

public class Test {
    public static void main(String[] args) {
        Car car = new Car("Ferrari", 200, false);
        System.out.println(car.getModel());
        System.out.println(car.getMaxSpeed());
        System.out.println(car.isAutomatic());
    }
}
