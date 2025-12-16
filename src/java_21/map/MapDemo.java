package java_21.map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, Integer> carsMap = new HashMap<>();
        carsMap.put("Ferrari", 35000);
        carsMap.put("Mercedes", 40000);
        carsMap.put("BMW", 30000);
        carsMap.put("BMW", 25000);
        carsMap.put("Ford", 20000);
        System.out.println("carsMap: " + carsMap);
        System.out.println("BMW: " + carsMap.get("BMW"));
        for (String key : carsMap.keySet()) {
            System.out.println("key: " + key + " value: " + carsMap.get(key));
        }
        System.out.println("=========================");

        for (Map.Entry<String, Integer> entryMap : carsMap.entrySet()) {
            System.out.println("key: " + entryMap.getKey() + " value: " + entryMap.getValue());
        }
        carsMap.replace("Mercedes", 45000);
        System.out.println(carsMap);
    }
}
