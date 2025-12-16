package java21.strings;

import java.util.Arrays;

public class UsefulMethodsOfString {
    public static void main(String[] args) {
        String s1 = "Hello Java Developers";
        String s2 = "Java is fun";
        String[] s3;
        System.out.println("s1: " + s1);
        System.out.println("s1 length: " + s1.length());
        System.out.println("1st char of s1: " + s1.charAt(0));
        System.out.println("1st char of s1: " + s1.charAt(0));
        System.out.println("isEmpty() s1: " + s1.isEmpty());
        System.out.println("substring s1: " + s1.substring(6));
        System.out.println("s1 is equal to s2: " + s1.equals(s2));
        System.out.println("s1 concat s2: " + s1.concat(s2));
        System.out.println("s1 in LowerCase: " + s1.toLowerCase());
        System.out.println("s1 in UpperCase: " + s1.toUpperCase());
        System.out.println("s1 replace 'l' with 'L': " + s1.replace("l", "L"));
        s3 = s1.split(" ");
        System.out.println("s3: " + Arrays.toString(s3));


        s1 = "Hello Java Developers";
        s2 = "Java is fun";
        s3 = new String[]{};

        // charAt()
        System.out.println(s1.charAt(0));
        System.out.println(s1.charAt(1));
        System.out.println(s1.charAt(20));

        // indexOf()
        System.out.println(s1.indexOf('p'));
        System.out.println(s1.indexOf('v', 10));
        System.out.println(s1.indexOf("lop"));
        System.out.println(s1.indexOf("lop", 25));

    }
}
