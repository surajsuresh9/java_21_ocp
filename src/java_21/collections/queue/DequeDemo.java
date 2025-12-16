package java_21.collections.queue;

import java.util.Deque;
import java.util.LinkedList;

// double ended queue
// FIFO
// LIFO
public class DequeDemo {
    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<>();

        // Add elements
        deque.add("Mercedes");
        deque.add("BMW");
        deque.add("Ferrari");
        System.out.println("carsDeque: " + deque);

        deque.addFirst("Ford");
        System.out.println("carsDeque: " + deque);

        deque.addLast("Opel");
        System.out.println("carsDeque: " + deque);

        deque.push("Honda"); // add at beginning
        System.out.println("carsDeque: " + deque);

        deque.offer("Hyundai"); // add at beginning
        System.out.println("carsDeque: " + deque);// add at end

        deque.offerFirst("Kia"); // add at beginning
        System.out.println("carsDeque: " + deque);// add at beginning

        deque.offerLast("Renault"); // add at beginning
        System.out.println("carsDeque: " + deque);// add at end

        // Delete elements
        deque.removeFirst();// remove first element
        System.out.println("carsDeque: " + deque);// add at end

        deque.removeLast();// remove last element
        System.out.println("carsDeque: " + deque);// add at end
    }
}
