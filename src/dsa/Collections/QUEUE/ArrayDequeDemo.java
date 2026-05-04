package dsa.Collections.QUEUE;

import java.util.ArrayDeque;

public class ArrayDequeDemo {
    public static void main(String[] args) {

        ArrayDeque<Integer> ad = new ArrayDeque<>();

        // ================= CREATE =================
        System.out.println("=== CREATE ===");

        ad.addFirst(10);
        ad.addLast(20);
        ad.offerFirst(5);
        ad.offerLast(25);

        System.out.println("Deque: " + ad);

        // ================= READ =================
        System.out.println("\n=== READ ===");

        System.out.println("First: " + ad.peekFirst());
        System.out.println("Last: " + ad.peekLast());

        System.out.println("Contains 20? " + ad.contains(20));
        System.out.println("Size: " + ad.size());

        // ================= UPDATE =================
        System.out.println("\n=== UPDATE ===");

        // Replace 20 → 200
        ArrayDeque<Integer> temp = new ArrayDeque<>();

        while (!ad.isEmpty()) {
            int val = ad.pollFirst();

            if (val == 20) {
                temp.addLast(200);
            } else {
                temp.addLast(val);
            }
        }

        ad = temp;

        System.out.println("After Update: " + ad);

        // ================= DELETE =================
        System.out.println("\n=== DELETE ===");

        ad.pollFirst(); // remove front
        ad.pollLast();  // remove rear

        System.out.println("After Delete: " + ad);

        // ================= ITERATE =================
        System.out.println("\n=== ITERATE ===");

        for (int x : ad) {
            System.out.println(x);
        }
    }
}
