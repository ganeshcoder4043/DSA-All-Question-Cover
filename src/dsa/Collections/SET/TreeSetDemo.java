package dsa.Collections.SET;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {

        TreeSet<Integer> ts = new TreeSet<>();

        ts.add(1);
        ts.add(12);
        ts.add(54);
        ts.add(5);
        ts.add(54); // duplicate (ignore hoga)
        ts.add(32);
        ts.add(56);
        ts.add(57);
        ts.add(58);

        System.out.println("TreeSet: " + ts);

        // read
        System.out.println("All Elements: " + ts);
        System.out.println("Contains 32? " + ts.contains(32));
        System.out.println("Size: " + ts.size());

        //update
        // TreeSet me direct update nahi hota
        // remove + add
        if (ts.contains(54)) {
            ts.remove(54);
            ts.add(100);
        }
        System.out.println("After Update: " + ts);

        // delete
        ts.remove(12);
        System.out.println("After Delete: " + ts);

        // Extra methods
        System.out.println("First: " + ts.first());
        System.out.println("Last: " + ts.last());
        System.out.println("Higher than 54: " + ts.higher(54));
        System.out.println("Lower than 54: " + ts.lower(54));
    }
}