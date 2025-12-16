package java_21.jvm_and_threads;

public class Task implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread name: " + Thread.currentThread().getName() + ", State: " + Thread.currentThread().getState());
    }
}
