package java21.stream_api.reduce;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class EmployeeStreamTest {
    public static void main(String[] args) {
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

        Comparator<Employee> salaryComparator = (e1, e2) -> {
            if (e1.getSalary() > e2.getSalary()) {
                return 1;
            } else if (e1.getSalary() < e2.getSalary()) {
                return -1;
            } else {
                return 0;
            }
        };

        // highest sal employee
        Employee highestSal = employees.stream().sorted(salaryComparator.reversed()).findFirst().orElse(null);
        Optional<Employee> optionalEmployee = employees.stream().reduce((e1, e2) -> e1.getSalary() > e2.getSalary() ? e1 : e2);
        System.out.println(highestSal);
        optionalEmployee.ifPresent(System.out::println);

        int totalSal = employees.stream()
                .map(Employee::getSalary)
                .reduce(0, Integer::sum);
        System.out.println(totalSal);

        int sumSalary = employees.stream().map(Employee::getSalary).mapToInt(Integer::intValue).sum();
        System.out.println(sumSalary);

        String combinedNames = employees.stream().map(Employee::getName).reduce("", (a, b) -> a + " " + b);
        System.out.println(combinedNames);
    }

}
