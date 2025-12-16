package java_21.lock;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockDemo {
    private final ReentrantLock lock = new ReentrantLock();
    private int counter = 0;

    public void increaseCounter() {
        try {
            lock.lock();
            counter++;
            System.out.println(Thread.currentThread().getName() + " incremented counter: " + counter);
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ReentrantLockDemo demo = new ReentrantLockDemo();

        Thread t1 = new Thread(() -> {
            demo.increaseCounter();
        }, "thread-1");
        Thread t2 = new Thread(() -> {
            demo.increaseCounter();
        }, "thread-2");
        Thread t3 = new Thread(() -> {
            demo.increaseCounter();
        }, "thread-3");
        t1.start();
        t2.start();
        t3.start();
        t1.join();
        t2.join();
        t3.join();
    }
}
