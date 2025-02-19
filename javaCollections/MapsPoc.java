package javaCollections;

import java.util.HashMap;
import java.util.Map;

public class MapsPoc {
    public static void main(String[] args) {
        Map<String, Integer> ages = new HashMap();
        ages.put("Alice", 30);
        ages.put("Bob", 25);
        ages.put("Charlie", 35);

        System.out.println("Ages are given below with names: ");
        for (Map.Entry<String, Integer> entry : ages.entrySet()) {
            String name = entry.getKey();
            Integer age = entry.getValue();
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        }
    }
}
