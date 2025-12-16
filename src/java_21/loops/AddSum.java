package java21.loops;

import java.util.Scanner;

public class AddSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add numbers, that need to be summed, Press 'N' to exit");
        int sum = 0;
        String ip;
        do {
            ip = scanner.next();
            if (!ip.equalsIgnoreCase("N")) {
                sum += Integer.parseInt(ip);
            }
        } while (!ip.equalsIgnoreCase("N"));
        System.out.println("Sum: " + sum);
    }
}
