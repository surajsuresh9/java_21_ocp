package java21.nested_classes;

public class Persons {
    static String person1 = "John";
    private static String person2 = "David";
    public String person3 = "Andy";

    static class StaticPerson {
        void show() {
            System.out.println("Person1: " + person1);
            System.out.println("Person2: " + person2);
//            System.out.println("Person3: " + person3);
        }
    }
}
