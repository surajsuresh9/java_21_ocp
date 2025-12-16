package java21.stream_api.reduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReductionDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Optional<Integer> reduce = list.stream().reduce((a, b) -> a + b);
        int sum = reduce.orElse(0);
        System.out.println("sum: " + sum);

        int sum2 = list.stream().reduce(0, (a, b) -> a + b);
        System.out.println("sum: " + sum2);
        int prod = list.stream().reduce(1, (a, b) -> a * b);
        System.out.println("prod: " + prod);
        Optional<Integer> largest = list.stream().reduce((a, b) -> a > b ? a : b);
        largest.ifPresent(System.out::println);
        Optional<Integer> smallest = list.stream().reduce((a, b) -> a < b ? a : b);
        smallest.ifPresent(System.out::println);
    }
}
