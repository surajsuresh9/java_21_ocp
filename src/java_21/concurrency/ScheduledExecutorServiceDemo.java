package java21.concurrency;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorServiceDemo {
    public static void main(String[] args) throws InterruptedException {
        ScheduledExecutorService service = Executors.newScheduledThreadPool(3);
        for (int i = 0; i < 5; i++) {
            java21.concurrency.Task task = new java21.concurrency.Task("task-" + i);
            service.schedule(task, 2, TimeUnit.SECONDS); // task1 runs after 2s, task-2 after 4s and so on
        }
        // will start after an initial delay of 1s and run every 5s
        // runs at 1s
        // runs at 6s
        // runs at 11s
        service.scheduleAtFixedRate(new java21.concurrency.Task("Fixed Rate Task"), 1, 5, TimeUnit.SECONDS);

        // starts after 2s
        // wait 5s to run again
        // doesn't wait for task to finish (it task takes longer, next task is started regardless
        service.scheduleWithFixedDelay(new java21.concurrency.Task("Fixed Delay Task"), 2, 5, TimeUnit.SECONDS);
        Thread.sleep(20000);

        // will complete all tasks and shutdown
        service.shutdown();
        System.out.println("Scheduled Executor Service shutdown");
    }
}
