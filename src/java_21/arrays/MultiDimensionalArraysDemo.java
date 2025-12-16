package java_21.arrays;

import java.util.Arrays;

public class MultiDimensionalArraysDemo {
    public static void main(String[] args) {
        int[][] twoDArray = new int[3][3];// 9 total ele
        twoDArray[0][0] = 0;
        twoDArray[0][1] = 1;
        twoDArray[0][2] = 2;
        twoDArray[1][0] = 3;
        twoDArray[1][1] = 4;
        twoDArray[1][2] = 5;
        twoDArray[2][0] = 6;
        twoDArray[2][1] = 7;
        twoDArray[2][2] = 8;
        System.out.println(Arrays.toString(twoDArray));

        System.out.println("[ ");
        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray[i].length; j++) {
                if (j == 0) {
                    System.out.print("[ " + twoDArray[i][j] + ", ");
                } else if (j == 2) {
                    System.out.print(twoDArray[i][j] + " ]");
                } else {
                    System.out.print(twoDArray[i][j] + ", ");
                }
            }
            System.out.println();
        }
        System.out.println(" ]");
    }

    char[][][] threeDArr = new char[][][]{{{'a', 'b', 'c'}, {'d', 'e'}}, {{'f', 'g'}, {'h'}, {'i', 'j', 'k', 'l'}}};

}