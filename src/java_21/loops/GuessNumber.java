package java21.loops;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int randNum = random.nextInt(100);
        System.out.println("randNum: " + randNum);
        Scanner sc = new Scanner(System.in);
        System.out.println("Guess a number between 1 and 100");

        boolean guessedNum = false;
        while (!guessedNum) {
            int guessNum = sc.nextInt();
            if (guessNum == randNum) {
                System.out.println("🎉 Good Guess!, that's the right number");
                guessedNum = true;
            } else {
                if (guessNum > randNum) {
                    System.out.println("Guess Lower");
                } else {
                    System.out.println("Guess Higher");
                }
            }
        }
        sc.close();
    }
}
