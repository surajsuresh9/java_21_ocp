package java_21.exception_handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        boolean isFlag = false;
        do {
            Scanner sc = new Scanner(System.in);
            try {
                System.out.println("Enter first number");
                int a = sc.nextInt();
                System.out.println("Enter second number");
                int b = sc.nextInt();
                System.out.println("Result: " + (a / b));
                isFlag = true;
                sc.close();
            } catch (InputMismatchException e) {
                System.out.println("Please enter a number");
            } catch (ArithmeticException e) {
                System.out.println("second number cannot be 0");
            } catch (Exception e) {
                System.out.println("an exception has occurred");
            } finally {
                System.out.println("This block is always executed");
            }
        } while (!isFlag);
    }
}
