package java21.oops.abstraction.encapsulation;

public class Car extends Vehicle {
    boolean isAutomatic = false;

    public Car(String model, int maxSpeed, boolean isAutomatic) {
        super(model, maxSpeed);
        this.isAutomatic = isAutomatic;
    }

    public void setAutomatic(boolean automatic) {
        isAutomatic = automatic;
    }

    public boolean isAutomatic() {
        return isAutomatic;
    }
}
