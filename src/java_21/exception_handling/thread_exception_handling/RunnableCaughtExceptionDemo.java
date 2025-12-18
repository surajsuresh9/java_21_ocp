package java_21.exception_handling.thread_exception_handling;

public class RunnableCaughtExceptionDemo {
    public static void main(String[] args) {
        Runnable task = () -> {
            while (true) {
                try {
                    System.out.println(Thread.currentThread().getName() + ": task started");
                    double value = Math.random();
                    System.out.println("Generated num for thread: " + Thread.currentThread().getName() + " is: " + value);
                    if (value > 0.5) {
                        throw new RuntimeException("Simulated error");
                    }
                    System.out.println(Thread.currentThread().getName() + ": task completed successfully");
                } catch (Exception e) {
                    System.out.println(Thread.currentThread().getName() + " caught exception: " + e.getMessage());
                    break;
                }
            }
        };
        Thread t1 = new Thread(task, "Thread-1");
        Thread t2 = new Thread(task, "Thread-2");

        t1.start();
        t2.start();
    }
}
