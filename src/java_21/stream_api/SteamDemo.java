package java_21.stream_api;

import java.util.Arrays;
import java.util.List;

public class SteamDemo {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 13, 4, 8, 12, 1, 5, 17, 5);
        System.out.println("Original: " + integers);
        integers = integers.stream().sorted().distinct().toList();
        System.out.println("Sorted: " + integers);
        integers = integers.stream().filter(n -> n % 2 == 0).toList();
        System.out.println(integers);
        integers = integers.stream().map(n -> n + 1).toList();
        System.out.println(integers);
    }
}
