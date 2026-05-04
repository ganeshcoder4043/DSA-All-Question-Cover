package dsa.Collections.Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        //create
        map.put("india", 140);
        map.put("china", 145);
        map.put("brazil", 120);
        map.putIfAbsent("uk", 69); // tabhi add add hoga jb uk nhi hoga
        System.out.println(map);

        //read
        System.out.println(map.get("brazil"));
        System.out.println(map.containsKey("india"));

        // iterable
        for (String key : map.keySet()){
            System.out.println(key +" " + map.get(key));
        }

        //update
        map.replace("USA", 35);  // USA ki value 35 hui
        map.replace("China", 142, 143);   // Tabhi update agar value 142 thi

        //delete
        map.remove("UK");                 // UK hata diya
        map.remove("USA", 35);            // USA tabhi hatega agar value 35 hai


        // Size + Clear
        System.out.println("Size: " + map.size());
        System.out.println("Empty: " + map.isEmpty());
        map.clear();
        System.out.println("After Clear: " + map);
    }
}
