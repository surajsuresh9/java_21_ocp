package java21.oops.polymorphism;

public class Test {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
//        v1.accelerate();
        Vehicle v2 = new MotorCycle();
//        v2.accelerate();

        if (v1 instanceof Vehicle) {
            Car car = (Car) v1;
            car.accelerate();
        }
        if (v2 instanceof MotorCycle) {
            MotorCycle motorCycle = (MotorCycle) v2;
            motorCycle.accelerate();
        }
    }
}
