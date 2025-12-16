package java21.static_keyword;

//import static java21.static_keyword.Employee.*;

import static java21.static_keyword.Employee.showSalary;
import static java21.static_keyword.Employee.increase;

public class Test {
    public static void main(String[] args) {
        Car.showCurrentSpeed(Car.currentSpeed);
        Car.speedUp(50);
        Car.speedUp(140);
        Car.slowDown(30);
        Car.stop();

        System.out.println("==============");
        showSalary();
        increase(750);
    }
}
