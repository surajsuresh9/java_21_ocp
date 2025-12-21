package java_21.profiling_multi_threaded_app;

public class BankingApp {
    public static void main(String[] args) throws InterruptedException {
        BankAccount bankAccount = new BankAccount();
        Runnable task = () -> {
            bankAccount.deposit(100);
            bankAccount.deposit(50);
        };

        Thread[] threads = new Thread[10];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(task);
            threads[i].start();
        }

        for (Thread t : threads) {
            t.join();
        }
        System.out.println("Final balance: " + bankAccount.getBalance());
    }
}
