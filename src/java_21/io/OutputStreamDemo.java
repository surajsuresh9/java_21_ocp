package java21.io;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class OutputStreamDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter text");
        String input = sc.nextLine();
        try (OutputStream os = new FileOutputStream("data.txt")) {
            byte[] bytes = input.getBytes();
            os.write(bytes);
            System.out.println("File successfully written");
            os.flush();
            os.close();
            sc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
