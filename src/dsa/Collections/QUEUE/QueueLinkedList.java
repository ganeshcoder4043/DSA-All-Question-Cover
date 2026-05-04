package dsa.Collections.QUEUE;

import java.util.LinkedList;
import java.util.Queue;

public class QueueLinkedList {
    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();

        //create
        q.add(10);
        q.add(20);
        q.offer(30);  //-> queue method
        q.offer(40);
        System.out.println(q);

        // read
        System.out.println(q.peek());
        System.out.println(q.element());

        // check element
        System.out.println(q.contains(30)); // if presnet true if not false

        // update
        // direct not update
        if (q.contains(20)){
            q.remove(20);
            q.add(200);
        }else {
            System.out.println("20 element is not present");
        }

        // delete

        System.out.println(q.poll());
        System.out.println(q.remove(10));

        System.out.println(q);
    }
}
