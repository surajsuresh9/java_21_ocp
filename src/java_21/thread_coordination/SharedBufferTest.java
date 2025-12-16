package java_21.thread_coordination;

public class SharedBufferTest {
    public static void main(String[] args) {
        SharedBuffer sharedBuffer = new SharedBuffer();
        Thread producerThread = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                sharedBuffer.produce(i + 1);
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "Producer Thread");
        Thread consumerThread = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                sharedBuffer.consume();
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "Consumer Thread");

        producerThread.start();
        consumerThread.start();
    }
}
