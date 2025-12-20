package java_21.arrays.advanced_locking_mechanism;

public class StampedLockTest {
    public static void main(String[] args) throws InterruptedException {
        BankAccount bankAccount = new BankAccount();
        Runnable depositTask = () -> {
            for (int i = 0; i < 3; i++) {
                bankAccount.deposit(100);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        };

        Runnable withdrawTask = () -> {
            for (int i = 0; i < 3; i++) {
                bankAccount.withdraw(50);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        };

        Runnable readTask = () -> {
            for (int i = 0; i < 3; i++) {
                bankAccount.getBalanceOptimistic();
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        };

        Thread depositerThread = new Thread(depositTask, "Deposit-Thread");
        Thread withdrawThread = new Thread(withdrawTask, "Withdraw-Thread");
        Thread readThread = new Thread(readTask, "Read-Thread");

        depositerThread.start();
        withdrawThread.start();
        readThread.start();

        depositerThread.join();
        withdrawThread.join();
        readThread.join();

        System.out.println("Final balance: " + bankAccount.getBalance());

    }
}
