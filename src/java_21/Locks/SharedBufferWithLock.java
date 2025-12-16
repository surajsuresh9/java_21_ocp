package java_21.Locks;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SharedBufferWithLock {
    private final Lock lock = new ReentrantLock();
    private final Condition condition = lock.newCondition();
    private int data;
    private boolean hasData;


    public void produce(int val) throws InterruptedException {
        lock.lock();
        try {

            while (hasData) {
                condition.await();
            }
            data = val;
            System.out.println(Thread.currentThread().getName() + " produced " + val);
            hasData = true;
            condition.signal();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

    }

    public void consume() {
        try {
            lock.lock();
            while (!hasData) {
                condition.await();
            }
            System.out.println(Thread.currentThread().getName() + " consumed " + data);
            hasData = false;
            condition.signal();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        SharedBufferWithLock sharedBufferWithLock = new SharedBufferWithLock();

        Thread producer = new Thread(() -> {
            for (int i = 0; i < 10; i++) {

                try {
                    sharedBufferWithLock.produce(i + 1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }, "Producer");

        Thread consumer = new Thread(() -> {
            for (int i = 0; i < 10; i++) {

                sharedBufferWithLock.consume();
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }, "Consumer");
        producer.start();
        consumer.start();
    }
}
