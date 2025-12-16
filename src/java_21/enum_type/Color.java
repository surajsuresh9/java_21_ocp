package java_21.enum_type;

import java.util.Scanner;

public enum Color {
    RED, YELLOW, GREEN
}

class ColorTest {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input color");
        String ipColor = sc.next();
        Color color;
        try {
            color = Color.valueOf(ipColor);
            switch (color) {
                case RED:
                    System.out.println("You entered RED");
                    break;
                case GREEN:
                    System.out.println("You entered GREEN");
                    break;
                case YELLOW:
                    System.out.println("You entered YELLOW");
                    break;
                default:
                    System.out.println("Not a valid color");
                    break;
            }
        } catch (IllegalArgumentException ex) {
            System.out.println("Please enter a valid color");
        }
    }
}
