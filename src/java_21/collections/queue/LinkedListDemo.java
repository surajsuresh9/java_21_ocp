package java_21.collections.queue;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListDemo {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();
        q.add("Mercedes");
        q.add("Ferrarri");
        q.add("BMW");
        q.add("Ford");
        q.add("Opel");
        System.out.println(q);
        System.out.println("Size: " + q.size());
        System.out.println("First el: " + q.element()); // throws ex
        System.out.println("First el: " + q.peek()); // doesn't throw ex
//        System.out.println("Removed el: " + q.poll()); // returns null value, no ex
        System.out.println(q);
//        System.out.println("Removed el: " + q.remove());
        System.out.println(q);

        int size = q.size();
        for (int i = 0; i < size; i++) {
            String removed = q.poll();
            System.out.println("Removed: " + removed);
        }
        System.out.println(q);
        System.out.println(q.peek()); // null

        // throws ex
//        System.out.println(q.element());

        System.out.println(q.poll()); // null

        // throws ex
//        System.out.println(q.remove());
    }
}
