package java_21.lock.conditions;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class SharedQueue {
    Queue<Integer> queue = new LinkedList<>();
    private int capacity = 5;

    private final ReentrantLock lock = new ReentrantLock();
    private final Condition notFull = lock.newCondition();
    private final Condition notEmpty = lock.newCondition();

    void produce(int val) {
        lock.lock();
        try {
            while (queue.size() == capacity) {
                System.out.println("Queue is full, Producer is waiting..");
                notFull.await();
            }
            queue.add(val);
            System.out.println("Produced: " + val);
            notEmpty.signal();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            lock.unlock();
        }
    }

    void consume() {
        lock.lock();
        try {
            while (queue.isEmpty()) {
                System.out.println("Queue is empty, Consumer is waiting..");
                notEmpty.await();
            }
            Integer polledVal = queue.poll();
            System.out.println("Consumed: " + polledVal);
            notFull.signal();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        SharedQueue sharedQueue = new SharedQueue();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                sharedQueue.produce(i + 1);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }, "Producer");
        Thread t2 = new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            for (int i = 0; i < 10; i++) {
                sharedQueue.consume();
            }
        }, "Consumer");
        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }
}
