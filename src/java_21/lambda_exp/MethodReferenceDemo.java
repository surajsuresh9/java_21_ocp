package java_21.lambda_exp;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReferenceDemo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Andy", "Jacob", "Sara");
        names.forEach(System.out::println);

        Function<String, Integer> stringToInt = Integer::parseInt;
        String str = "hello";
        Supplier<String> strSupplier = str::toUpperCase;
    }
}
