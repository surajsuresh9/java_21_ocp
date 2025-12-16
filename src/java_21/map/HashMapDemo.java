package java_21.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> ageMap = new HashMap<>();
        ageMap.put("Alex", 35);
        ageMap.put("James", 21);
        ageMap.put("Jones", 27);
        ageMap.put("Ronaldo", 30);
        ageMap.put("Steve", 25);
        System.out.println("ageMap: " + ageMap);
        System.out.println("=========================");
        LinkedHashMap<String, String> carColorsMap = new LinkedHashMap<>();
        carColorsMap.put("BMW", "Red");
        carColorsMap.put("Mercedes", "Green");
        carColorsMap.put("Audi", "Yellow");
        carColorsMap.put("Opel", "Blue");
        carColorsMap.put("Ford", "Orange");
        System.out.println(carColorsMap);
        System.out.println("=========================");

        TreeMap<Integer, String> countryCodes = new TreeMap<>();
        countryCodes.put(91, "India");
        countryCodes.put(64, "New Zealand");
        countryCodes.put(90, "Turkey");
        countryCodes.put(33, "France");
        countryCodes.put(1, "Canada");
        countryCodes.put(44, "UK");
        System.out.println("ascending map: " + countryCodes);
        System.out.println("=========================");
        System.out.println("descending map: " + countryCodes.descendingMap());
        System.out.println("=========================");
        System.out.println("ascending keySet: " + countryCodes.keySet());
        System.out.println("=========================");
        System.out.println("descending keySet: " + countryCodes.descendingKeySet());
        System.out.println("=========================");

        countryCodes.remove(44);
        for (Map.Entry<Integer, String> entry : countryCodes.entrySet()) {
            System.out.println("Phone code of: " + entry.getValue() + " is " + entry.getKey());
        }
    }
}
