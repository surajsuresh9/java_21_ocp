package java21.stream_api.parallel_streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ParallelStreamDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        list.stream().forEach(el -> System.out.print(el + " "));
        System.out.println();
        list.parallelStream().forEach(el -> System.out.print(el + " "));
        System.out.println();
        Map<Boolean, List<Integer>> groupedMap = list.parallelStream().collect(Collectors.groupingByConcurrent(n -> n % 2 == 0));
        System.out.println(groupedMap);
    }
}
