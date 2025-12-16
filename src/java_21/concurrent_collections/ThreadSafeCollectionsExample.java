package java_21.concurrent_collections;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ThreadSafeCollectionsExample {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> orderList = new CopyOnWriteArrayList<>();
        Thread t1 = new Thread(() -> {
            addOrder(orderList, "Order 1");
        });
        Thread t2 = new Thread(() -> {
            addOrder(orderList, "Order 2");
        });
        t1.start();
        t2.start();
    }

    public static void addOrder(List<String> orderList, String order) {
        orderList.add(order);
        System.out.println(Thread.currentThread().getName() + " added: " + order);
    }
}
