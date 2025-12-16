package java_21.jvm_and_threads;

public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new Task(), "Thread-1");
        Thread t2 = new Thread(new Task(), "Thread-2");
        Thread t3 = new Thread(new Task(), "Thread-3");

        System.out.println("Thread-1 before start: " + t1.getState());
        System.out.println("Thread-2 before start: " + t2.getState());
        System.out.println("Thread-3 before start: " + t3.getState());

        t1.start();
        t2.start();
        t3.start();

        Thread.sleep(500L);

        System.out.println("Thread-1 after start: " + t1.getState());
        System.out.println("Thread-2 after start: " + t2.getState());
        System.out.println("Thread-3 after start: " + t3.getState());


    }
}
