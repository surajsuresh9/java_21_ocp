package java21.strings;

public class StringDemo {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World";
//        System.out.println(s1);
//        System.out.println(s2);
        String s1Obj = new String("Hello");
        String s2Obj = new String("World");
//        System.out.println(s1Obj);
//        System.out.println(s2Obj);
        System.out.println(s1 + " " + s2);
        System.out.println(s1Obj + " "   + s2Obj);

    }
}
