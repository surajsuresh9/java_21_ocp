package java21.oops.inheritance.this_example;

public class ThisKeyword {
    String car;
    int year;

    ThisKeyword() {
        this("Audi", 2025);

    }

    public ThisKeyword(String car, int year) {
        this.car = car;
        this.year = year;
    }

    void printHelloWorld() {
        System.out.print("Hello");
        this.printWorld();
    }

    void printWorld() {
        System.out.print(" World");
    }

    public static void main(String[] args) {
//        ThisKeyword thisKeyword = new ThisKeyword("Ferrarri", 2025);
        ThisKeyword thisKeyword = new ThisKeyword();
        System.out.println("Car: " + thisKeyword.car);
        System.out.println("Year: " + thisKeyword.year);
        thisKeyword.printHelloWorld();
    }
}
