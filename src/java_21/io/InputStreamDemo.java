package java21.io;

import java.io.FileInputStream;
import java.io.InputStream;

public class InputStreamDemo {
    public static void main(String[] args) {
        try (InputStream is = new FileInputStream("data.txt")) {
            System.out.println("available: " + is.available());

            System.out.println("Reading data");
            StringBuilder data = new StringBuilder();

            int b;
            while ((b = is.read()) != -1) {
                data.append((char) b);
            }

            System.out.println("Reading complete");
            System.out.println(data);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
