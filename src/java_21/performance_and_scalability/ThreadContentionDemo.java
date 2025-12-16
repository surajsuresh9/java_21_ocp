package java_21.performance_and_scalability;

import java.util.concurrent.locks.ReentrantLock;

public class ThreadContentionDemo {
    private static final ReentrantLock lock = new ReentrantLock();
    private static int counter = 0;

    public static void main(String[] args) {
        Runnable task = (() -> {
            for (int i = 0; i < 5; i++) {
                lock.lock();
                try {
                    System.out.println(Thread.currentThread().getName() + " is incrementing the counter: " + counter);
                    counter++;
                    Thread.sleep(100L);
                } catch (Exception e) {
                    Thread.currentThread().interrupt();
                } finally {
                    System.out.println(Thread.currentThread().getName() + " is releasing the lock");
                    lock.unlock();
                }
            }
        });

        Thread t1 = new Thread(task, "Thread-1");
        Thread t2 = new Thread(task, "Thread-2");
        Thread t3 = new Thread(task, "Thread-3");

        t1.start();
        t2.start();
        t3.start();
    }
}
