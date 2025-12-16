package java_21.lock;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReentrantReadWriteLockDemo {
    private final ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
    private final ReentrantReadWriteLock.ReadLock readLock = lock.readLock();
    private final ReentrantReadWriteLock.WriteLock writeLock = lock.writeLock();

    private int data = 0;

    public void writeData(int val) {
        try {
            writeLock.lock();
            data = val;
            System.out.println(Thread.currentThread().getName() + " wrote value: " + val);
        } finally {
            writeLock.unlock();
        }
    }

    public void readData() {
        try {
            readLock.lock();
            System.out.println(Thread.currentThread().getName() + " read value: " + data);
        } finally {
            readLock.unlock();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ReentrantReadWriteLockDemo demo = new ReentrantReadWriteLockDemo();

        Thread t1 = new Thread(() -> {
            demo.writeData(49);
        }, "writer-thread-0");
        Thread t2 = new Thread(() -> {
            demo.readData();
        }, "reader-thread-1");
        Thread t3 = new Thread(() -> {
            demo.readData();
        }, "reader-thread-2");
        t1.start();
        t2.start();
        t3.start();
        t1.join();
        t2.join();
        t3.join();
    }
}
