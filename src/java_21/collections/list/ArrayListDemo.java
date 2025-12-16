package java21.collections.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<Object> mixed = new ArrayList<>();
        mixed.add(20);
        mixed.add(20);
        mixed.add("Java");
        mixed.add(true);
        System.out.println(mixed);
        System.out.println("-------------------");
        List<String> names1 = new ArrayList<>();
        names1.add("Alice");
        names1.add("Charles");
        names1.add("Bob");
        List<String> names2 = new ArrayList<>();
        names2.add("Alice");
        names2.add("Bob");
        names2.add("Charles");
        System.out.println(names2.equals(names1));
    }
}
