package java_21.concurrent_collections;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class BlockingQueueDemo {
    public static void main(String[] args) throws InterruptedException {
        LinkedBlockingQueue<Integer> queue = new LinkedBlockingQueue<>(3);
        // if full, q is blocked until space is available
        // if empty, q is blocked until el are added
        Thread t1 = new Thread(() -> {
            try {
                produce(queue);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }, "Producer");
        Thread t2 = new Thread(() -> {
            try {
                consume(queue);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }, "Consumer");
        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }

    static void produce(BlockingQueue<Integer> queue) throws InterruptedException {
        for (int i = 0; i < 5; i++) {
            System.out.println("Producing: " + i);
            queue.put(i);
            System.out.println("Produced: " + i);
            Thread.sleep(1000);
        }

    }

    static void consume(BlockingQueue<Integer> queue) throws InterruptedException {
        for (int i = 0; i < 5; i++) {
            Integer take = queue.take();
            System.out.println("Consumed: " + take);
            Thread.sleep(1100);
        }
    }
}
