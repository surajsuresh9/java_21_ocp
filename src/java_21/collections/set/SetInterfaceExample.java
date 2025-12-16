package java21.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetInterfaceExample {

    public static void main(String[] args) {
        Set<String> hs = new HashSet<>();
        hs.add("Cat");
        hs.add("Dog");
        hs.add("Cow");
        hs.add("Lion");
        hs.add("Ant");
        hs.add("Dog");
        System.out.println("animalSet: " + hs);
        System.out.println("size of animalSet: " + hs.size());
        hs.remove("Cow");
        System.out.println("animalSet: " + hs);
        System.out.println("animalSet contains sheep?: " + hs.contains("Sheep"));

        Set<Integer> set1 = new HashSet<>();
        set1.add(10);
        set1.add(12);
        set1.add(13);
        set1.add(17);
        set1.add(16);
        set1.add(14);
        System.out.println("Set1= " + set1);
        Set<Integer> set2 = new HashSet<>();
        set2.add(10);
        set2.add(11);
        set2.add(12);
        set2.add(15);
        set2.add(13);
        set2.add(19);
        set2.add(13);
        System.out.println("Set2= " + set2);

        // intersection of both set
        Set<Integer> intersectingSet = new HashSet<>(set1);
        intersectingSet.retainAll(set2);
        System.out.println("intersectingSet: " + intersectingSet);

        // union
        Set<Integer> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2);
        System.out.println("unionSet: " + unionSet);


        // difference
        Set<Integer> differenceOfSet1FromSet2 = new HashSet<>(set1);
        differenceOfSet1FromSet2.retainAll(set2);
        System.out.println("differenceOfSet1FromSet2: " + differenceOfSet1FromSet2);


    }
}
