package java21.methods;

import java.util.Scanner;

public class ExponentialNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a base number and the power to which it has to be raised");
        System.out.println("Base number");
        int base = sc.nextInt();
        System.out.println("Power to raise the number");
        int power = sc.nextInt();
        findExponentialNumber(base, power);
    }

    private static long findExponentialNumber(int base, int power) {
        int res = 1;
        for (int i = 0; i < power; i++) {
            res *= base;
            System.out.println(base + " raised to the power of " + (i + 1) + " is: " + res);
        }
        return res;
    }
}
