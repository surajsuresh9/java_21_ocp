package java21.nested_classes;

import java.util.Scanner;

public class LocalInnerClassExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = scanner.nextInt();
        checkNumber(num);
    }

    // Method Inner Class
    public static void checkNumber(int enteredNum) {
        int res = 0;

        // local inner class
        class CheckNumber {
            boolean check;

            public CheckNumber(int number) {
                check = number % 2 == res ? true : false;
            }

            // inner class method
            public void printNum() {
                System.out.println("You entered: " + enteredNum);
            }
        }
        CheckNumber checkNumber = new CheckNumber(enteredNum);
        checkNumber.printNum();
        if (checkNumber.check) {
            System.out.println(enteredNum + " is an even number");
        } else {
            System.out.println(enteredNum + " is an odd number");
        }
    }
}
