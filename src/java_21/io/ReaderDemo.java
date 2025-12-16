package java21.io;

import java.io.*;

public class ReaderDemo {

    public static void main(String[] args) {
        try (Reader reader = new FileReader(new File("demo.txt"))) {
            System.out.println("Reading started");
            int charRead;
            if (reader.ready()) {
                do {
                    charRead = reader.read();
                    if (charRead != -1) {
                        System.out.print((char) charRead);
                    }
                } while (charRead != -1);
            }
            System.out.println("\nReading completed");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
