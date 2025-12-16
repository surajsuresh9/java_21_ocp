package java_21.concurrent_collections;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ConcurrentHashMapDemo {
    public static void main(String[] args) throws InterruptedException {
        Map<String, String> concurrentHashMap = new ConcurrentHashMap<>();
        ExecutorService service = Executors.newFixedThreadPool(3);

        for (int i = 0; i < 6; i++) {
            String taskName = "Task " + i;
            service.submit(() -> {
                String threadName = Thread.currentThread().getName();
                System.out.println(threadName + " is executing " + taskName);
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                concurrentHashMap.put(taskName, "Completed by: " + threadName);
            });
        }
        service.shutdown();
        service.awaitTermination(10, TimeUnit.SECONDS);
        System.out.println("==========================");
        concurrentHashMap.forEach((k, v) -> {
            System.out.println(k + " " + v);
        });
    }
}
