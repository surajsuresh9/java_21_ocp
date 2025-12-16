package java21.io;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.util.Scanner;

public class WriterDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text");
        String text = sc.nextLine();

        try (Writer writer = new FileWriter(new File("demo.txt"))) {
            writer.write(text);
            System.out.println("File written successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
        sc.close();
    }
}
