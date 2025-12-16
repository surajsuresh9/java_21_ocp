package java_21.atomic_vars;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class AtomicVaribaleDemo {
    public static void main(String[] args) throws InterruptedException {
        AtomicInteger counter = new AtomicInteger(10);
        System.out.println("counter: " + counter);
        ExecutorService service = Executors.newFixedThreadPool(3);
        for (int i = 0; i <= 5; i++) {
            service.submit(() -> {
                String threadName = Thread.currentThread().getName();
                int newVal = counter.incrementAndGet();
                System.out.println(threadName + " incremented value of counter to: " + newVal);
            });
        }
        service.shutdown();
        service.awaitTermination(10, TimeUnit.SECONDS);
        System.out.println("Final value of counter: " + counter);
    }
}
