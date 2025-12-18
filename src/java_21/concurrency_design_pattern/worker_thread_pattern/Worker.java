package java_21.concurrency_design_pattern.worker_thread_pattern;

import java.util.concurrent.BlockingQueue;

public class Worker extends Thread {
    BlockingQueue<Runnable> blockingQueue;

    Worker(BlockingQueue<Runnable> blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
        while (true) {
            Runnable taken;
            try {
                taken = blockingQueue.take();
                taken.run();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }
    }
}
