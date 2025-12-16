package java21.strings;

import java.util.Arrays;

public class StringEqualityDemo {
    public static void main(String[] args) {
        String s1 = new String("Hello Developers"); // heap
        String s2 = new String("Hello Developers"); // heap
        String s3 = "Hello Developers"; // new literal
        String s4 = "Hello Developers"; // same literal
        String s5 = "Hello" + " Developers"; // same literal

        // ==
        System.out.println("s1 == s2: " + (s1 == s2));
        System.out.println("s1 == s3: " + (s1 == s3));
        System.out.println("s1 == s4: " + (s1 == s4));
        System.out.println("s1 == s5: " + (s1 == s5));
        System.out.println("s2 == s3: " + (s2 == s3));
        System.out.println("s2 == s4: " + (s2 == s4));
        System.out.println("s2 == s5: " + (s2 == s5));
        System.out.println("s3 == s4: " + (s3 == s4));
        System.out.println("s3 == s5: " + (s3 == s5));
        System.out.println("s4 == s5: " + (s4 == s5));

        System.out.println("===========================");
        // id
        System.out.println("id of s1: " + System.identityHashCode(s1));
        System.out.println("id of s2: " + System.identityHashCode(s2));
        System.out.println("id of s3: " + System.identityHashCode(s3));
        System.out.println("id of s4: " + System.identityHashCode(s4));
        System.out.println("id of s5: " + System.identityHashCode(s5));

        System.out.println("===========================");
        //equals
        System.out.println("s1.equals(s2): " + (s1.equals(s2)));
        System.out.println("s1.equals(s3): " + (s1.equals(s3)));
        System.out.println("s1.equals(s4): " + (s1.equals(s4)));
        System.out.println("s1.equals(s5): " + (s1.equals(s5)));
        System.out.println("s2.equals(s3): " + (s2.equals(s3)));
        System.out.println("s2.equals(s4): " + (s2.equals(s4)));
        System.out.println("s2.equals(s5): " + (s2.equals(s5)));
        System.out.println("s3.equals(s4): " + (s3.equals(s4)));
        System.out.println("s3.equals(s5): " + (s3.equals(s5)));
        System.out.println("s4.equals(s5): " + (s4.equals(s5)));

        // wrapper classes
        System.out.println("===========================");
        Integer age1 = 20;
        int age2 = 20;
        System.out.println("age1 == age2: " + (age1 == age2));

        // string arrays
        System.out.println("===========================");
        String[] animals1 = new String[]{"Dog", "Cat", "Cow"};
        String[] animals2 = {"Dog", "Cat", "Cow"};
        String[] animals3 = new String[3];

        animals3[0] = "Dog";
        animals3[1] = "Cat";
        animals3[2] = "Cow";

        // ==
        String[] animals4 = animals1;
        System.out.println("animals1 == animals2: " + (animals1 == animals2));
        System.out.println("animals1 == animals3: " + (animals1 == animals3));
        System.out.println("animals1 == animals4: " + (animals1 == animals4));
        System.out.println("animals2 == animals3: " + (animals2 == animals3));
        System.out.println("animals2 == animals4: " + (animals2 == animals4));
        System.out.println("animals3 == animals4: " + (animals3 == animals4));
        System.out.println("===========================");

        // equals
        // calls the Object.equals() which internally calls ==
        System.out.println("animals1.equals(animals2): " + (animals1.equals(animals2)));
        System.out.println("animals1.equals(animals3): " + (animals1.equals(animals3)));
        System.out.println("animals1.equals(animals4): " + (animals1.equals(animals4)));
        System.out.println("animals2.equals(animals3): " + (animals2.equals(animals3)));
        System.out.println("animals2.equals(animals4): " + (animals2.equals(animals4)));
        System.out.println("animals3.equals(animals4): " + (animals3.equals(animals4)));

        // Arrays.equals(a1,a2)
        System.out.println("===========================");
        System.out.println("Arrays.equals(animals1, animals2): " + Arrays.equals(animals1, animals2));
        System.out.println("Arrays.equals(animals1, animals3): " + Arrays.equals(animals1, animals3));
        System.out.println("Arrays.equals(animals1, animals4): " + Arrays.equals(animals1, animals4));
        System.out.println("Arrays.equals(animals2, animals3): " + Arrays.equals(animals2, animals3));
        System.out.println("Arrays.equals(animals2, animals4): " + Arrays.equals(animals2, animals4));
        System.out.println("Arrays.equals(animals3, animals4): " + Arrays.equals(animals3, animals4));

    }
}
