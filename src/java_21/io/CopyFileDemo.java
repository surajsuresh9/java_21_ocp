package java21.io;

import java.io.*;
import java.util.Arrays;

public class CopyFileDemo {
    public static void main(String[] args) throws FileNotFoundException {
        File src = new File("C:\\Users\\sursures\\Desktop\\sample.txt");
        File dest = new File("C:\\Users\\sursures\\Desktop\\output.txt");
        if (!src.exists()) {
            throw new FileNotFoundException("File sample.txt doesn't exist");
        }
        System.out.println("Copying file.. ");
        int charRead;
        StringBuilder data = new StringBuilder();
        try (Reader br = new BufferedReader(new FileReader(src));
             Writer writer = new FileWriter(dest)) {
            while ((charRead = br.read()) != -1) {
                writer.write(charRead);
            }
            System.out.println("File copied successfully..");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
