package java_21.concurrency_design_pattern.producer_consumer_pattern;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {
    private final BlockingQueue<Integer> queue;

    public Producer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                int val = (int) (Math.random() * 100);
                queue.put(val);
                System.out.println("Produced: " + val);
                Thread.sleep(500);
            }
            // poison pill
            queue.put(-1);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
