package java_21.arrays.advanced_locking_mechanism;

import java.util.concurrent.locks.StampedLock;

public class BankAccount {
    private double balance = 0;
    private final StampedLock lock = new StampedLock();

    void deposit(double amount) {
        long stamp = lock.writeLock();
        try {
            System.out.println(Thread.currentThread().getName() + " depositing " + amount);
            balance += amount;
            System.out.println(Thread.currentThread().getName() + " new balance " + balance);
        } finally {
            lock.unlock(stamp);
        }
    }

    void withdraw(int amount) {
        long stamp = lock.writeLock();
        try {
            if (balance >= amount) {
                balance -= amount;
                System.out.println(Thread.currentThread().getName() + " withdrew " + amount + ", new balance: " + balance);
            } else {
                System.out.println(Thread.currentThread().getName() + " withdrew " + amount + ", Insufficient balance");
            }
        } finally {
            lock.unlock(stamp);
        }
    }

    double getBalanceOptimistic() {
        long optimisticReadLock = lock.tryOptimisticRead();
        double currBalance = balance;
        if (lock.validate(optimisticReadLock)) {
            optimisticReadLock = lock.readLock();
            try {
                currBalance = balance;
            } finally {
                lock.unlock(optimisticReadLock);
            }
        }
        System.out.println(Thread.currentThread().getName() + " reading balance: " + currBalance);
        return currBalance;
    }

    public double getBalance() {
        long stamped = lock.readLock();
        try {
            return balance;
        } finally {
            lock.unlockRead(stamped);
        }
    }
}
