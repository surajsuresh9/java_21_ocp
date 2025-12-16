package java_21.performance_and_scalability;

import java.util.concurrent.*;

public class ThreadPoolExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(3);
        Callable<Integer> fiveSquareTask = () -> {
            System.out.println(Thread.currentThread().getName() + " is calculating square of 5");
            return 5 * 5;
        };
        Callable<Integer> sevenSquareTask = () -> {
            System.out.println(Thread.currentThread().getName() + " is calculating square of 7");
            return 7 * 7;
        };
        Callable<Integer> tenSquareTask = () -> {
            System.out.println(Thread.currentThread().getName() + " is calculating square of 10");
            return 10 * 10;
        };

        Future<Integer> futureRes1 = service.submit(fiveSquareTask);
        Future<Integer> futureRes2 = service.submit(sevenSquareTask);
        Future<Integer> futureRes3 = service.submit(tenSquareTask);

        System.out.println("Square of 5: " + futureRes1.get());
        System.out.println("Square of 7: " + futureRes2.get());
        System.out.println("Square of 10: " + futureRes3.get());

        service.shutdown();
        service.awaitTermination(10, TimeUnit.SECONDS);
    }
}
