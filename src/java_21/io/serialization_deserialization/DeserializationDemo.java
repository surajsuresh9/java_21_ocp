package java21.io.serialization_deserialization;

import java.io.*;
import java.util.Arrays;
import java.util.List;

public class DeserializationDemo {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("persons.txt");
            ObjectInputStream ois = new ObjectInputStream(fileInputStream);
            Object personObj = ois.readObject();
            System.out.println("deserialization complete!");
//            System.out.println(personObj);
            personObj = (List<Person>) personObj;
            ((List<?>) personObj).forEach(p -> System.out.println(p));
            ois.close();
            fileInputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
