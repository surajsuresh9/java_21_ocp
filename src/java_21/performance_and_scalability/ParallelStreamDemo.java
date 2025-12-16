package java_21.performance_and_scalability;

import java.util.List;

public class ParallelStreamDemo {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        integers.parallelStream().forEach(i -> System.out.println(Thread.currentThread().getName() + ":  num= " + i + ", square=" + (i * i)));
    }
}
