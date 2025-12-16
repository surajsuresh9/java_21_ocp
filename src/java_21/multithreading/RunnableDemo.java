package java21.multithreading;

public class RunnableDemo implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + (i + 1));
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = new RunnableDemo();
        Thread t = new Thread(runnable);
        System.out.println("State: " + t.getState());
        t.start();
        System.out.println("State: " + t.getState());
        t.join();
        System.out.println("State: " + t.getState());
        System.out.println(Thread.currentThread().getName() + " exiting");
    }
}
