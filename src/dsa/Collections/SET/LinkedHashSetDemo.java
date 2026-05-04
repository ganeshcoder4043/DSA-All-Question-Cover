package dsa.Collections.SET;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
    public static void main(String[] args) {

        Set<Integer> lhs = new LinkedHashSet<>();
        //create
        lhs.add(1);
        lhs.add(12);
        lhs.add(54);
        lhs.add(5);
        lhs.add(54);
        lhs.add(32);
        lhs.add(54);
        lhs.add(54);
        System.out.println(lhs);

        //read
        System.out.println("After Create: " + lhs);

        // update direct possible nhi hai thats means ki phele remove than add
        if (lhs.contains(1)){
            lhs.remove(1);
            lhs.add(1000);
        }
        System.out.println("After update :"+ lhs);

        // DELETE
        lhs.remove(54);
        System.out.println("After Delete: " + lhs);
    }
}
