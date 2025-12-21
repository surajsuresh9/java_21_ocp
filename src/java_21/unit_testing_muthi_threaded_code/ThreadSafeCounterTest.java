package java_21.unit_testing_muthi_threaded_code;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadSafeCounterTest {

    @Test
    public void testThreadSafeCounterWithMultipleThreads() throws InterruptedException {
        ThreadSafeCounter counter = new ThreadSafeCounter();
        ExecutorService service = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 10_000; i++) {
            service.submit(() -> {
                counter.increment();
            });
        }
        service.shutdown();
        service.awaitTermination(1, TimeUnit.SECONDS);
        Assertions.assertEquals(10_000, counter.getCounter());
    }
}