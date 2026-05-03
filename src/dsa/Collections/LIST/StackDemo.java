package dsa.Collections.LIST;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        // CREATE (push)
        stack.push(1);
        stack.push(12);
        stack.push(5);
        stack.push(32);
        stack.push(54);

        System.out.println("After Create: " + stack);

        // READ (peek) Top element(Biggest Number)
        System.out.println("Top element: " + stack.peek());

        // UPDATE (no direct method → pop + push)
        stack.pop();        // remove top (54)
        stack.push(100);    // add new value

        System.out.println("After Update: " + stack);

        // DELETE (pop)
        stack.pop();   // remove top element

        System.out.println("After Delete: " + stack);


        /* -> Also use ArrayList methods easily*/
        System.out.println();
        System.out.println("Also use ArrayList methods easily");
        // CREATE
        stack.add(1);
        stack.add(12);
        stack.add(5);
        stack.add(32);
        stack.add(54);
        stack.add(3, 69); //=> add value through indexing
        stack.addFirst(0);
        stack.addLast(100);


        System.out.println("After Create: " + stack);


        // READ
        System.out.println("Element at index 1: " + stack.get(1));

        // UPDATE
        stack.set(1, 100);
        System.out.println("After Update: " + stack);

        // DELETE
        stack.remove(0);
        System.out.println("After Delete: " + stack);
    }
}
