package java21.loops;

import java.util.Scanner;

public class WhileLoopDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number for which the factorial needs to be found");
        int numIp = sc.nextInt();
        int num = numIp;
        int factorial = 1;
        if (num == 0 || num == 1) {
            System.out.println("Factorial of " + numIp + " is: " + factorial);
        } else {
            while (num != 0) {
                factorial *= num;
                num--;
            }
            System.out.println("Factorial of " + numIp + " is: " + factorial);
        }
    }
}
