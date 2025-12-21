package java_21.profiling_multi_threaded_app;

public class BankAccount {
    private int balance = 0;

    synchronized void deposit(int amt) {
        balance += amt;
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            Thread.currentThread().interrupt();
        }
    }

    synchronized void withdraw(int amt) {
        if (balance >= amt) {
            balance -= amt;
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public int getBalance() {
        return balance;
    }
}
