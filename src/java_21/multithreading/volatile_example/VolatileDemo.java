package java21.multithreading.volatile_example;

public class VolatileDemo {
    private volatile boolean isRunning = true;

    void stopRunning() {
        isRunning = false;
    }

    void run() {
        while (isRunning) {
            System.out.println("Thread is running");
        }
        System.out.println("Thread stopped");
    }

    public static void main(String[] args) throws InterruptedException {
        VolatileDemo vd = new VolatileDemo();
        Thread t1 = new Thread(vd::run);

        t1.start();
        Thread.sleep(1000);

        vd.stopRunning();
    }
}
