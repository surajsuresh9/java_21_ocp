package java_21.decision_making;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("=======================");
        System.out.println("CALCULATOR");
        System.out.println("=======================");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println("Enter desired operation +, -, *, /, %");
        char operation = sc.next().charAt(0);
        double res = 0.0d;
        switch (operation) {
            case '+':
                res = n1 + n2;
                break;
            case '-':
                res = n1 - n2;
                break;
            case '*':
                res = n1 * n2;
                break;
            case '/':
                res = (double) n1 / n2;
                break;
            case '%':
                res = n1 % n2;
                break;
            default:
                System.out.println("Invalid operation");
                return;
        }
        sc.close();
        System.out.println(n1 + " " + operation + " " + n2 + " = " + res);
    }
}
