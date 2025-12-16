package java_21.performance_and_scalability;

import java.util.concurrent.locks.ReentrantLock;

public class DeadlockDemo {
    private static final ReentrantLock lock1 = new ReentrantLock();
    private static final ReentrantLock lock2 = new ReentrantLock();

    public static void main(String[] args) {
        Runnable task1 = () -> {
            lock1.lock();
            try {
                System.out.println(Thread.currentThread().getName() + " acquired lock1, waiting for lock2 ...");
                Thread.sleep(200L);
                lock2.lock();
                try {
                    System.out.println(Thread.currentThread().getName() + " acquired lock2");
                } finally {
                    lock2.unlock();
                }
            } catch (Exception e) {
                Thread.currentThread().interrupt();
            } finally {
                lock1.unlock();
            }
        };

        Runnable task2 = () -> {
            lock2.lock();
            try {
                System.out.println(Thread.currentThread().getName() + " acquired lock2, waiting for lock1 ...");
                Thread.sleep(200L);
                lock1.lock();
                try {
                    System.out.println(Thread.currentThread().getName() + " acquired lock1");
                } finally {
                    lock1.unlock();
                }
            } catch (Exception e) {
                Thread.currentThread().interrupt();
            } finally {
                lock2.unlock();
            }
        };

        Thread t1 = new Thread(task1, "Thread-1");
        Thread t2 = new Thread(task2, "Thread-2");

        t1.start();
        t2.start();
    }
}
