package java21.static_keyword;

public class Employee {
    static int currSalary = 1000;

    public static void showSalary() {
        System.out.println("currSalary: " + currSalary);
    }

    public static void increase(int raise) {
        System.out.println("You received a " + raise + " raise");
        currSalary += raise;
        System.out.println("currSalary: " + currSalary);
    }
}
