package java21.static_keyword;

public class Car {
    static int currentSpeed = 0;
    static int maxSpeed = 100;

    static void showCurrentSpeed(int speed) {
        System.out.println("currentSpeed: " + speed);
    }

    static void showMaxSpeed() {
        System.out.println("maxSpeed: " + maxSpeed);
    }

    public static void speedUp(int increase) {
        currentSpeed += increase;
        if (currentSpeed > maxSpeed) {
            showCurrentSpeed(currentSpeed);
            System.out.println("Please slow down");
        } else {
            showCurrentSpeed(currentSpeed);
        }
    }

    public static void slowDown(int decrease) {
        currentSpeed -= decrease;
        showCurrentSpeed(currentSpeed);
    }

    public static void stop() {
        currentSpeed = 0;
        showCurrentSpeed(currentSpeed);
    }
}
