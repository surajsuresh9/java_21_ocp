package java21.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortArrayList {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Steve");
        names.add("Zeke");
        names.add("Carrol");
        names.add("Alice");
        names.add("Bob");
        names.add("Mike");

        // list.sort
        names.sort(Collections.reverseOrder());
        System.out.println(names);

        // Collections.sort
        Collections.sort(names);
        System.out.println(names);

        names.clear();
        names.add("3");
        names.add("300");
        names.add("20");
        names.add("35");
        names.add("37");
        names.add("31");
        names.add("4");
        names.add("70");
        names.add("ant");
        names.add("0");
        names.add("Zebra");
        Collections.sort(names);
        // 0 20 3 300 31 35 37 4 70 Zebra ant
        System.out.println(names);
    }
}
