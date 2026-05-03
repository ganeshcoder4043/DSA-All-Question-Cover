package dsa.Collections.LIST;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args) {

        List<Integer> al = new ArrayList<>(); //=> Best Practice
//      ArrayList<Integer> al1 = new ArrayList<>(); //=> Avoid


        // CREATE
        al.add(1);
        al.add(12);
        al.add(5);
        al.add(32);
        al.add(54);
        al.add(3,69); //=> add value through indexing
        al.addFirst(0);
        al.addLast(100);


        System.out.println("After Create: " + al);


        // READ
        System.out.println("Element at index 1: " + al.get(1));

        // UPDATE
        al.set(1, 100);
        System.out.println("After Update: " + al);

        // DELETE
        al.remove(0);
        System.out.println("After Delete: " + al);
    }
/*
After Create: [1, 12, 5, 69, 32, 54]
Element at index 1: 12
After Update: [1, 100, 5, 69, 32, 54]
After Delete: [100, 5, 69, 32, 54]
*/
}