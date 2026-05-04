package dsa.Collections.QUEUE;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {
    public static void main(String[] args) {

        /* Min heap-> Jo sabse chhota hai wo pehle niklega/remove hoga*/

        Queue<Integer> min = new PriorityQueue<>();
        min.add(30);
        min.add(10);
        min.add(20);

        System.out.println(min.poll()); // 10
        System.out.println(min.poll()); // 20
        System.out.println(min.poll()); // 30


        /* Max heap-> Jo sabse bada(big) hai wo pehle niklega/remove hoga*/

        PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
        max.add(30);
        max.add(10);
        max.add(20);

        System.out.println();
        System.out.println("max");
        System.out.println(max.poll()); // 30
        System.out.println(max.poll()); // 20
        System.out.println(max.poll()); // 10




        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // ================= CREATE =================
        System.out.println("=== CREATE ===");
        pq.offer(30);
        pq.offer(10);
        pq.offer(20);

        System.out.println("Queue: " + pq);

        // ================= READ =================
        System.out.println("\n=== READ ===");
        System.out.println("Peek: " + pq.peek()); // smallest
        System.out.println("Contains 20? " + pq.contains(20));
        System.out.println("Size: " + pq.size());

        // ================= UPDATE =================
        System.out.println("\n=== UPDATE ===");
        // 20 ko 200 se replace karna

        PriorityQueue<Integer> temp = new PriorityQueue<>();

        while (!pq.isEmpty()) {
            int val = pq.poll();

            if (val == 20) {
                temp.offer(200);
            } else {
                temp.offer(val);
            }
        }

        pq = temp;

        System.out.println("After Update: " + pq);

        // ================= DELETE =================
        System.out.println("\n=== DELETE ===");
        System.out.println("Removed: " + pq.poll());

        System.out.println("After Delete: " + pq);
    }
}
