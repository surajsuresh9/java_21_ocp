package java_21.exception_handling.custom_exception;

public class BankAccount {
    private double balance;

    public BankAccount() {
        balance = 0.0;
    }

    void deposit(double amt) {
        balance += amt;
    }

    void withdraw(int amt) throws InsufficientFundException {
        if (amt > balance) {
            throw new InsufficientFundException("Cannot withdraw, Insufficient funds");
        }
        balance -= amt;
    }

    public double getBalance() {
        return balance;
    }
}
