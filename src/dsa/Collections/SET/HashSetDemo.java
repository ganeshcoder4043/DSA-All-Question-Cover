package dsa.Collections.SET;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {

        Set<Integer> hs = new HashSet<>();

        //create
        hs.add(1);
        hs.add(12);
        hs.add(54);
        hs.add(5);
        hs.add(54);
        hs.add(32);
        hs.add(54);
        hs.add(54);
        System.out.println(hs);

        //read
        System.out.println("After Create: " + hs);

        // update direct possible nhi hai thats means ki phele remove than add
        if (hs.contains(1)){
            hs.remove(1);
            hs.add(1000);
        }
        System.out.println("After update :"+ hs);

        // DELETE
        hs.remove(54);
        System.out.println("After Delete: " + hs);
    }
}
