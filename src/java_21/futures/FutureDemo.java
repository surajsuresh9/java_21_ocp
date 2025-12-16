package java_21.futures;

import java.util.concurrent.*;

public class FutureDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(3);
        Callable<String> callable = () -> {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " is executing Callable task");
            Thread.sleep(2000L);
            return "Result from " + threadName;
        };
        Future<String> stringFuture = service.submit(callable);
        System.out.println("stringFuture: " + stringFuture.get());
        service.shutdown();

    }
}
