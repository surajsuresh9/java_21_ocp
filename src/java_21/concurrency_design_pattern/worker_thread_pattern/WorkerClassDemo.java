package java_21.concurrency_design_pattern.worker_thread_pattern;

import java.util.Arrays;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class WorkerClassDemo {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<Runnable> blockingQueue = new ArrayBlockingQueue<>(10);
        int numOfWorkerThreads = 3;
        Worker[] workers = new Worker[numOfWorkerThreads];

        // start workers
        for (int i = 0; i < workers.length; i++) {
            workers[i] = new Worker(blockingQueue);
            workers[i].start();
        }

        // add tasks to queue
        for (int i = 0; i < 10; i++) {
            blockingQueue.add(new Task(String.valueOf(i + 1)));
        }

        // stop workers after all tasks are processed
        Thread.sleep(200);
        Arrays.stream(workers).forEach(Thread::interrupt);

    }
}
