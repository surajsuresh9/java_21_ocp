package java21.io.serialization_deserialization;

import java.io.*;
import java.util.Arrays;
import java.util.List;

public class SerializationDemo {
    public static void main(String[] args) {
        try {
            List<Person> persons = Arrays.asList(new Person(1, "Benjamin", "Smith", 20, false, 79.6),
                    new Person(2, "Emily", "Johnson", 21, false, 55.0),
                    new Person(3, "Alexander", "Williams", 23, true, 68),
                    new Person(4, "William", "Taylor", 24, true, 77.6));

            FileOutputStream fileOutStream = new FileOutputStream(new File("persons.txt"));
            ObjectOutputStream oos = new ObjectOutputStream(fileOutStream);
            oos.writeObject(persons);
            System.out.println("serialization complete!");
            oos.close();
            fileOutStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
