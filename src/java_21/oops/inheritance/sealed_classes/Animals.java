package java21.oops.inheritance.sealed_classes;

public sealed class Animals permits Cat, Dog, Bird {
    int numOfLegs;

    void printLegs() {
        System.out.println("numOfLegs: " + numOfLegs);
    }

    public void eat(String animals) {
        System.out.println(animals + " eat food");
    }

    protected void drink(String animals) {
        System.out.println(animals + " drink water");
    }

    void move(String animals) {
        System.out.println(animals + " move");
    }

    public void breath(String animals) {
        System.out.println(animals + " breathe");
    }
}
