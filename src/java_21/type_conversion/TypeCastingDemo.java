package java_21.type_conversion;

import java.util.Scanner;

public class TypeCastingDemo {
    public static void main(String[] args) {
        int a = 124;
        long b;
        double c;
        b = a;
        c = a;
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);
        System.out.println("------------------------------");
        double dbl = 135.35;
        long lng = (long) dbl;
        System.out.println("double val: " + dbl);
        System.out.println("long val: " + lng);
        byte byt = (byte) lng;
        System.out.println("byte val: " + byt);
        Scanner sc=new Scanner(System.in);
    }
}
