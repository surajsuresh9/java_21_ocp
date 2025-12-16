package java_21.operator;

public class OperatorPrecedenceDemo {
    public static void main(String[] args) {
        int res = 5 + 2 * 4; // 13
        System.out.println(res);

        res = (5 + 2) * 4; // 7 * 4 =28
        System.out.println(res);

        res += 80 / 20 % 8 * 3 + -5; // 80/20 = 4 % 8-> 4 * 3 = 12 + -5 = 7-> 28 + 7 = 35 same precedence (evaluated from L to R)
        System.out.println(res); // 35

//        int x = 8, y = 4, z = 2, sum = 0;
//        sum = x + --y + --z; // 8+ --4 + --2 // 8+3+1=12
//        System.out.println(sum);// 12   int x = 8, y = 4, z = 2, sum = 0;
//
//        int x = 8, y = 4, z = 2, sum = 0;
//        sum = x + y-- + --z; // 8+ 4-- + --2 // 8+4+1=13
//        System.out.println(sum);// 13

        int x = 8, y = 4, z = 2, sum = 0;
//        sum = x + y-- + --z + y; // 8+ 4-- + --2 // 8+4+1=12
//        System.out.println(sum);// 16

        sum = x + y-- + --z * y; // 8+ 3 + (1*3) // 8+4+3=15
        System.out.println(sum);
    }
}
