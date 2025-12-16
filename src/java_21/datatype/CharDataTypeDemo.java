package java_21.datatype;

public class CharDataTypeDemo {
    public static void main(String[] args) {
        // 0-65535
        char ch = 'c';
        System.out.println("char value: " + ch);
        System.out.println("char ASCII value: " + (int) ch);
        System.out.println("char value of 99: " + (char) 99);

//        char c1 = 'H';
        char c1 = 72;//H
        char c2 = 53;
        System.out.println();
        System.out.println("c1: " + c1);
        System.out.println("is first variable letter?: " + Character.isLetter(c1));
        System.out.println("is first variable digit?: " + Character.isDigit(c1));
        System.out.println();
        System.out.println("c2: " + c2);
        System.out.println("is first variable letter?: " + Character.isLetter(c2));
        System.out.println("is first variable digit?: " + Character.isDigit(c2));

        char letter1 = 67; // 67 -> F in ASCII
        int num1 = letter1 + 3; // 70 -> F in ASCII
        char letter2 = (char) num1; // F
        System.out.println("letter2: " + letter2);

        char letter3 = 70; // F in ASCII
        int letter4 = letter3--; //letter4= 70. letter3 -> 69, E in ASCII
        boolean check1 = letter4 == 'E'; //false
        boolean check2 = letter3 > 'D'; //E(69) > D(68)
        System.out.println("check1: " + check1);
        System.out.println("check2: " + check2);

    }
}
