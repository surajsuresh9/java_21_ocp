package java_21.collections.set;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();
        ts.add("P");
        ts.add("L");
        ts.add("M");
        ts.add("N");
        ts.add("Q");
        ts.add("B");
        ts.add("C");
        ts.add("Q");
        System.out.println("========================");
        System.out.println(ts);
        System.out.println("Descending Set: " + ts.descendingSet());
        System.out.println("Headset: " + ts.headSet("N"));
        System.out.println("Headset: " + ts.headSet("N", true));
        System.out.println("Subset: " + ts.subSet("C", "Z"));
        System.out.println("Tail set: " + ts.tailSet("N"));
        System.out.println("Tail set: " + ts.tailSet("N", false));
        System.out.println("Last element: " + ts.last());
        System.out.println("First element: " + ts.first());
        System.out.println("Remove first element: " + ts.pollFirst());
        System.out.println("Remove last element: " + ts.pollLast());
        System.out.println(ts);

    }
}
