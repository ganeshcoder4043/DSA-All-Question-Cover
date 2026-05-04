package dsa.Collections.QUEUE;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeDemo {
    public static void main(String[] args) {

        Deque<Integer> dq = new ArrayDeque<>();

        // ================= CREATE =================
        System.out.println("=== CREATE ===");

        dq.addFirst(10);   // front
        dq.addLast(20);    // rear
        dq.offerFirst(5);  // safer front
        dq.offerLast(25);  // safer rear

        System.out.println("Deque: " + dq);

        // ================= READ =================
        System.out.println("\n=== READ ===");

        System.out.println("Peek First: " + dq.peekFirst());
        System.out.println("Peek Last: " + dq.peekLast());

        System.out.println("Contains 20? " + dq.contains(20));
        System.out.println("Size: " + dq.size());

        // ================= UPDATE =================
        System.out.println("\n=== UPDATE ===");

        // Example: 20 ko 200 se replace karna
        Deque<Integer> temp = new ArrayDeque<>();

        while (!dq.isEmpty()) {
            int val = dq.pollFirst(); // front se nikaal

            if (val == 20) {
                temp.addLast(200); // replace
            } else {
                temp.addLast(val);
            }
        }

        dq = temp;

        System.out.println("After Update: " + dq);

        // ================= DELETE =================
        System.out.println("\n=== DELETE ===");

        dq.pollFirst(); // front remove (safe)
        dq.pollLast();  // rear remove (safe)

        System.out.println("After Delete: " + dq);

        // ================= ITERATE =================
        System.out.println("\n=== ITERATE ===");

        for (int x : dq) {
            System.out.println(x);
        }
    }
}
