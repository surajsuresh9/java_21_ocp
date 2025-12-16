package java_21.jvm_and_threads;

public class ThreadPriorityDemo {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i <= 5; i++) {
                System.out.println("Min priority thread: " + i);
            }
        }, "MIN");

        Thread t2 = new Thread(() -> {
            for (int i = 0; i <= 5; i++) {
                System.out.println("Max priority thread: " + i);
            }
        }, "MAX");

        Thread t3 = new Thread(() -> {
            for (int i = 0; i <= 5; i++) {
                System.out.println("Normal priority thread: " + i);
            }
        }, "NORMAL");
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t3.setPriority(Thread.NORM_PRIORITY);

        t2.start();
        t3.start();
        t1.start();
    }
}
