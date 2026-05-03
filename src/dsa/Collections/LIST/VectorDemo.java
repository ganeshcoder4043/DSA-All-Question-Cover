package dsa.Collections.LIST;

import java.util.List;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {

        List<Integer> vector = new Vector<>();
        // CREATE
        vector.add(1);
        vector.add(12);
        vector.add(5);
        vector.add(32);
        vector.add(54);
        vector.add(3,69); //=> add value through indexing
        vector.addFirst(0);
        vector.addLast(100);

        vector.add(3,69); //=> add value through indexing
        System.out.println("After Create: " + vector);


        // READ
        System.out.println("Element at index 1: " + vector.get(1));

        // UPDATE
        vector.set(1, 100);
        System.out.println("After Update: " + vector);

        // DELETE
        vector.remove(0);
        System.out.println("After Delete: " + vector);
    }
}
