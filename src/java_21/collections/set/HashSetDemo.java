package java_21.collections.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

    public static void main(String[] args) {
        Set<String> hs = new HashSet<>();
        hs.add("Mercedes");
        hs.add("BMW");
        hs.add("Ferrari");
        hs.add("Ferrari");
        hs.add("Ford");
        hs.add("Opel");
        hs.add("Opel");
        hs.add("Honda");
        System.out.println(hs);
    }
}
