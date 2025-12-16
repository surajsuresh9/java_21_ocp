package java_21.lambda_exp;

import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number");
        double num1 = scanner.nextDouble();
        System.out.println("Please enter second number");
        double num2 = scanner.nextDouble();
        calcuate(num1, num2, (n1, n2) -> {
            System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
            System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
            System.out.println(n1 + " * " + n2 + " = " + (n1 * n2));
            if (num2 == 0) {
                System.out.println(n1 + " / " + n2 + " = " + "divisor can't be 0");
            } else {
                System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
            }
        });
        scanner.close();
    }

    static void calcuate(double x, double y, Operation operation) {
        operation.performOperation(x, y);
    }
}


