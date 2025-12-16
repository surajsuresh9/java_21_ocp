package java_21.thread_coordination;

public class SharedBuffer {

    private int data;
    private boolean hasData = false;

    synchronized public void produce(int val) {
        while (hasData) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                e.printStackTrace();
            }
        }
        data = val;
        System.out.println(Thread.currentThread().getName() + " produced " + data);
        hasData = true;
        notify();
    }

    synchronized public void consume() {
        while (!hasData) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println(Thread.currentThread().getName() + " consumed " + data);
        hasData = false;
        notify();
    }
}
