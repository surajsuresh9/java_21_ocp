package java_21.case_studies.producer_consumer_model;

import java.util.LinkedList;
import java.util.List;

public class SharedBuffer {
    private final List<Order> buffer = new LinkedList<>();
    private final int capacity;

    public SharedBuffer(int capacity) {
        this.capacity = capacity;
    }

    public synchronized void produce(Order order) throws InterruptedException {
        // if list is full, wait for list
        // to have space to put order
        while (buffer.size() == capacity) {
            System.out.println("Buffer is full, Producer is waiting...");
            wait();// wait until space is available
        }
        buffer.add(order);
        System.out.println("Order was added: " + order);
        notifyAll();// notify Consumer
    }

    public synchronized Order consume() throws InterruptedException {
        while (buffer.isEmpty()) {
            System.out.println("Buffer is empty, Consumer is waiting");
            wait(); // wait until order is available
        }
        Order order = buffer.removeFirst();
        System.out.println("Order consumed: " + order);
        notifyAll(); // notify Producer
        return order;
    }
}
