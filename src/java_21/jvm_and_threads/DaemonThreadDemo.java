package java_21.jvm_and_threads;

public class DaemonThreadDemo {
    public static void main(String[] args) {
        Thread userThread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("User Thread: " + i);
                try {
                    Thread.sleep(1000L);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }, "User Thread");

        Thread daemonThread = new Thread(() -> {
            while (true) {
                System.out.println("Daemon thread running");
                try {
                    Thread.sleep(1500L);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }, "Daemon Thread");

        daemonThread.setDaemon(true);
        userThread.start();
        daemonThread.start();


    }
}
