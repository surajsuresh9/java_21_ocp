package java_21.concurrency_design_pattern.thread_per_message_pattern;

public class PrintRequestHandler implements Runnable {
    private String message;

    public PrintRequestHandler(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " processing: " + message);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName() + " processing message complete");
    }
}
