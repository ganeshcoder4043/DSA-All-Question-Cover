package dsa.Collections.LIST;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {

        List<Integer> list = new LinkedList<>();

        // CREATE
        list.add(1);
        list.add(12);
        list.add(5);
        list.add(32);
        list.add(54);
        list.add(2, 69);
        list.addFirst(0);
        list.addLast(100);
//        list.clear(); -> All Elements are remove

        System.out.println("After Create :" + list);

        //Read
        System.out.println("Element at Index :"+list.get(2));

        //Update
        list.set(5,59);
        System.out.println("After Update :"+ list);

        // delete
        list.remove(3);
        System.out.println("After Delete :" + list);

/*
After Create :[1, 12, 69, 5, 32, 54]
Element at Index :69
After Update :[1, 12, 69, 5, 32, 59]
After Delete :[1, 12, 69, 32, 59]
*/
    }
}
