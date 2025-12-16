package java_21.numbers;

public class NumbersDemo {
    public static void main(String[] args) {
        System.out.println("=========== Octal Numbers ===========");
        int octaNum1 = 015;
        int octaNum2 = 0104;
        System.out.println("octal number 1: " + octaNum1);
        System.out.println("octal number 2: " + octaNum2);
        System.out.println("Decimal sum: " + (octaNum1 + octaNum2));
        System.out.println("Octal sum: " + Integer.toOctalString(octaNum1 + octaNum2));

        System.out.println("=========== Hexadecimal Numbers ===========");
        int hexa1 = 0x100;
        int hexa2 = 0x2F;
        System.out.println("Hexadecimal number 1: " + hexa1);
        System.out.println("Hexadecimal number 2: " + hexa2);
        int sumHexNums = hexa1 + hexa2;
        System.out.println("Decimal sum: " + sumHexNums);
        System.out.println("Hexadecimal Sum : " + Integer.toHexString(sumHexNums));

        System.out.println("=========== Binary Numbers ===========");
        int bin1 = 0b1001;
        int bin2 = 0b1011;
        System.out.println("Binary number 1: " + bin1);
        System.out.println("Binary number 2: " + bin2);
        int binSum = bin1 + bin2;
        System.out.println("Decimal sum: " + binSum);
        System.out.println("Binary sum: " + Integer.toBinaryString(binSum));

    }
}
