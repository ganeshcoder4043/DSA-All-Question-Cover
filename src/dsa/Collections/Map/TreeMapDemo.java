package dsa.Collections.Map;

import java.util.Collections;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        // CREATE - Keys ascending order me
        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("Banana", 30);
        map.put("Apple", 50);
        map.put("Cherry", 20);
        map.put("Apple", 60); // Update (duplicate key)

        System.out.println("SORTED by Keys: " + map);
        // Output: {Apple=60, Banana=30, Cherry=20} — Alphabetically sorted

        // READ (Extra Navigation Methods)
        System.out.println("First Key: " + map.firstKey());     // Apple
        System.out.println("Last Key: " + map.lastKey());       // Cherry
        System.out.println("Higher than Apple: " + map.higherKey("Apple")); // Banana

        // Range Views
        SortedMap<String, Integer> sub = map.subMap("Apple", "Cherry");
        System.out.println("SubMap [Apple, Cherry): " + sub);
        // Output: {Apple=60, Banana=30} — Cherry exclusive

        // CRUD Same as HashMap
        map.remove("Banana");
        System.out.println("Contains Cherry? " + map.containsKey("Cherry")); // true

        // Reverse Order TreeMap
        TreeMap<String, Integer> revMap = new TreeMap<>(Collections.reverseOrder());
        revMap.putAll(map);
        System.out.println("REVERSE SORTED: " + revMap);
        // Output: {Cherry=20, Apple=60}
    }
}
