package java21.methods;

import java.util.Scanner;

public class VarArgsDemo {
    public static void main(String[] args) {
//        System.out.println(getData(Gender.FEMALE, "Video Games", "Cooking", "Travelling", "Playing violin", "Singing"));
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter numbers that need to be summed by giving a blank space between each number");
        String[] nums = sc.nextLine().split(" ");
        System.out.println(sumNumbers(nums));
        System.out.println(add(10, 20L));
    }

    private static int sumNumbers(String... nums) {
        int sum = 0;
        for (String n : nums) {
            sum += Integer.parseInt(n);
        }
        return sum;
    }

    private static String getData(Gender gender, String... hobbies) {
        StringBuilder data = new StringBuilder();
        data.append("Hi, I'm a ").append(gender).append(" and I like ");
        for (String hobby : hobbies) {
            data.append(hobby).append(", ");
        }
        return data.toString();
    }

    private static int add(int x, int y) {
        System.out.println("int, int");
        return x + y;
    }

    private static int add(int x, long y) {
        System.out.println("int, long");
        return x + (int) y;
    }
}

enum Gender {
    MALE, FEMALE;
}
