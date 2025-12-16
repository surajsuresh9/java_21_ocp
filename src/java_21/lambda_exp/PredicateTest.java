package java_21.lambda_exp;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateTest {
    public static void main(String[] args) {
        Predicate<String> isEmpty = s -> s.isEmpty();
        System.out.println("" + isEmpty.test(""));
        System.out.println(" " + isEmpty.test(" "));

        ArrayList<String> animals = new ArrayList<>();
        animals.add("Cow");
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Ant");
        animals.add("Lion");
        System.out.println(animals);

        Predicate<String> removeAnt = s -> s.equals("Ant");
        animals.removeIf(removeAnt);
        System.out.println(animals);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int ip = sc.nextInt();
        System.out.println(ip + " -- isEven: " + isEven(ip, i -> i % 2 == 0));
        sc.close();
    }

    static boolean isEven(int num, Predicate<Integer> checkIsEvenPredicate) {
        return checkIsEvenPredicate.test(num);
    }
}
