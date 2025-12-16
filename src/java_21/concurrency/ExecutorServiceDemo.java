package java21.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceDemo {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 10; i++) {
            Task task = new Task("task-" + i);
            service.submit(task);
        }
        service.shutdown();
        try {
            if (service.awaitTermination(60, TimeUnit.SECONDS)) {
                service.shutdown();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Executor service shutdown");
    }
}
