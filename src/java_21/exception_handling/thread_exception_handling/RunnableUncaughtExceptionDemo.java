package java_21.exception_handling.thread_exception_handling;

public class RunnableUncaughtExceptionDemo {
    public static void main(String[] args) {
        Thread.UncaughtExceptionHandler handler = (t, e) -> {
            System.out.println("Thread: " + t + " terminated with exception: " + e);
        };


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
        t1.setUncaughtExceptionHandler(handler);

        Thread t2 = new Thread(task, "Thread-2");
        t2.setUncaughtExceptionHandler(handler);

        t1.start();
        t2.start();

    }
}
