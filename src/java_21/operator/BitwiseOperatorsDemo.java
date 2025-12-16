package java_21.operator;

public class BitwiseOperatorsDemo {
    public static void main(String[] args) {
//        BITWISE AND (&)
        System.out.println("===================== BITWISE AND (&) Operator =====================");
        int num1 = 9; //1001
        int num2 = 8; //1000
        int res = num1 & num2; //1000; //8

        System.out.println("num 1 in binary: " + Integer.toBinaryString(num1));
        System.out.println("num 2 in binary: " + Integer.toBinaryString(num2));
        System.out.println("num1&num2 in binary: " + Integer.toBinaryString(res));
        System.out.println("num1&num2 in decimal: " + res);

        System.out.println("===================== BITWISE OR (|) Operator =====================");
        num1 = 9; //1001
        num2 = 8; //1000
        res = num1 | num2; //1001; //9

        System.out.println("num 1 in binary: " + Integer.toBinaryString(num1));
        System.out.println("num 2 in binary: " + Integer.toBinaryString(num2));
        System.out.println("num1|num2 in binary: " + Integer.toBinaryString(res));
        System.out.println("num1|num2 in decimal: " + res);


        System.out.println("===================== BITWISE XOR Exclusive OR (^) Operator =====================");
        num1 = 9; //1001
        num2 = 8; //1000
        res = num1 ^ num2; //0001; //1

        System.out.println("num 1 in binary: " + Integer.toBinaryString(num1));
        System.out.println("num 2 in binary: " + Integer.toBinaryString(num2));
        System.out.println("num1^num2 in binary: " + Integer.toBinaryString(res));
        System.out.println("num1^num2 in decimal: " + res);

        System.out.println("===================== BITWISE LEFT SHIFT (<<) Operator =====================");
        num1 = 8; //1000
        System.out.println("num 1 in binary: " + Integer.toBinaryString(num1));
        System.out.println("num1 << 2 in binary: " + Integer.toBinaryString(num2 << 2));
        System.out.println(num1);
        System.out.println(num1 << 2);

        System.out.println("===================== BITWISE RIGHT SHIFT (<<) Operator =====================");
        num1 = 8; //1000
        System.out.println(num1);
        System.out.println("num 1 in binary: " + Integer.toBinaryString(num1));
        System.out.println("num1 >> 2 in binary: " + Integer.toBinaryString(num2 >> 2));
        System.out.println(num1 >> 2);

        System.out.println("===================== UNARY BITWISE COMPLIMENT (~) Operator =====================");
        num1 = 8; // 1000
        //  1000 -> 00000000 00000000 00000000 00001000 (32 bit)
        // ~1000 -> 11111111 11111111 11111111 11110111 (32 bit)
        System.out.println(num1);
        System.out.println("num 1 in binary: " + Integer.toBinaryString(num1));
        System.out.println("~num1 in binary: " + Integer.toBinaryString(~num1));
        System.out.println(~num1);
        System.out.println();
        int num10 = 33; // ~0010 0001 -> 1101 1110 (222) (222-256) =-34
        //  33 -> 00000000 00000000 00000000 00100001
        // ~1000 -> 11111111 11111111 11111111 11011110
        System.out.println(num10);
        System.out.println("num 10 in binary: " + Integer.toBinaryString(num10));
        System.out.println("~num10 in binary: " + Integer.toBinaryString(~num10));
        System.out.println(~num10);

    }
}
