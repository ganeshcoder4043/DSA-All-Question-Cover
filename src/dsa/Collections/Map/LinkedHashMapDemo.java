package dsa.Collections.Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        // CREATE - Insertion Order Preserved
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        map.put("Zebra", 1);
        map.put("Apple", 2);
        map.put("Monkey", 3);

        System.out.println("INSERTION ORDER: " + map);
        // Output: {Zebra=1, Apple=2, Monkey=3} — jaise order insert hua vaise output aaya

        // READ (Same as HashMap)
        System.out.println("Get Zebra: " + map.get("Zebra")); // 1

        // UPDATE
        map.replace("Apple", 5);

        // DELETE
        map.remove("Monkey");

        // Iteration (Same as HashMap)
        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        // --- LRU Cache Style (Access Order) ---
        LinkedHashMap<String, Integer> lru = new LinkedHashMap<>(
                16,        // initialCapacity
                0.75f,     // loadFactor
                true       // accessOrder = true ←
        );

        lru.put("A", 1);
        lru.put("B", 2);
        lru.put("C", 3);

        lru.get("B");  // B recently used ban gaya
        lru.get("A");  // A recently used ban gaya

        System.out.println("LRU ORDER: " + lru);
        // Output: {C=3, B=2, A=1} — least recently used (C) sbse phele
    }
}
