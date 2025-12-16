package java_21.stream_api;

import java.util.Arrays;
import java.util.List;

public class ReductionDemo {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(10, 5, 3, 12, 8);
        double avg = nums.stream().filter(n -> n % 2 == 1).mapToInt(n -> n * 2).average().getAsDouble();
        double sum = nums.stream().filter(n -> n % 2 == 1).mapToInt(n -> n * 2).sum();
        System.out.println("avg: " + avg);
        System.out.println("sum: " + sum);
    }
}
