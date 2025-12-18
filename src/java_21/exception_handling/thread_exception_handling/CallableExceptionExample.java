package java_21.exception_handling.thread_exception_handling;

import java.util.concurrent.*;

public class CallableExceptionExample {
    public static void main(String[] args) {

        while (true) {
            ExecutorService executorService = Executors.newSingleThreadExecutor();

            Callable<String> callable = () -> {
                System.out.println(Thread.currentThread().getName() + ": task started");
                double value = Math.random();
                System.out.println("Generated num for thread: " + Thread.currentThread().getName() + " is: " + value);
                if (value > 0.5) {
                    throw new RuntimeException("Simulated error");
                }
                try {
                    Thread.sleep(1000L);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                return Thread.currentThread().getName() + ": task completed successfully";
            };

            Future<String> future = executorService.submit(callable);
            String res = null;
            try {
                future.get();
            } catch (ExecutionException | InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Thread interrupted");
                break;
            } finally {
                executorService.shutdown();
            }
            System.out.println("result: " + res);
        }
    }
}
