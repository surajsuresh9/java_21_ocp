package java21.loops;

import java.util.Scanner;

public class FibonacciNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter max number till which sequence needs to be summed");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += getFibNumber(i);
        }
        System.out.println("Sum up to " + n + " numbers is: " + sum);
    }

    private static int getFibNumber(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return getFibNumber(n - 1) + getFibNumber(n - 2);
    }
}
