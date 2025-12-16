package java_21.collections.set;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Mercedes");
        lhs.add("BMW");
        lhs.add("Ferrari");
        lhs.add("Ferrari");
        lhs.add("Ford");
        lhs.add("Opel");
        lhs.add("Opel");
        lhs.add("Honda");
        System.out.println("======================");
        System.out.println(lhs);
    }
}
