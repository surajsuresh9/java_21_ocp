package java21.stream_api.collect;

import java21.stream_api.reduce.Employee;
import java21.stream_api.reduce.Sex;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectDemo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("David", "Rogers", "Carol", "Andy", "Sarah");
        // length greater than 4
        List<String> filteredNames = names.stream().filter(s -> s.length() > 4).collect(Collectors.toList());
        System.out.println(filteredNames);

        // joining
        String collected = names.stream().collect(Collectors.joining(", ", "[", "]"));
        System.out.println(collected);

        Map<Integer, List<String>> collect = names.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(collect);
        Map<Boolean, List<String>> partitionedMap = names.stream().collect(Collectors.partitioningBy(s -> s.length() > 4));
        System.out.println("Greater than 4: " + partitionedMap.get(true));
        System.out.println("Less than 4: " + partitionedMap.get(false));

        // collect el length greater than 4 into a linkedlist
        LinkedList<String> collectedLinkedList = names.stream().filter(s -> s.length() > 4).collect(Collectors.toCollection(LinkedList::new));
        System.out.println("collectedLinkedList: " + collectedLinkedList);

        List<Employee> employees = Arrays.asList(
                new Employee("Claire", 80_000, Sex.FEMALE),
                new Employee("Alex", 10_000, Sex.MALE),
                new Employee("Jessica", 60_000, Sex.FEMALE),
                new Employee("Blake", 30_000, Sex.MALE),
                new Employee("Sara", 40_000, Sex.FEMALE),
                new Employee("Cody", 50_000, Sex.MALE),
                new Employee("Linda", 20_000, Sex.FEMALE),
                new Employee("Mike", 70_000, Sex.MALE)
        );

        // get avg sal by gender
        Map<Sex, Integer> sexIntegerMap = employees.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.summingInt(Employee::getSalary)));
        System.out.println(sexIntegerMap);

        SalaryCollector salaryCollector = employees.stream().map(Employee::getSalary).collect(SalaryCollector::new, SalaryCollector::accept, SalaryCollector::combine);
        System.out.println(salaryCollector);

    }
}
