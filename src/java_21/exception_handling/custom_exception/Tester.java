package java_21.exception_handling.custom_exception;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("============ BANK ACCOUNT MENU ============");
            System.out.println("1  Deposit");
            System.out.println("2  Withdraw");
            System.out.println("3  Show Balance");
            System.out.println("4  Quit");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Deposit Amount");
                    account.deposit(sc.nextInt());
                    break;
                case 2:
                    System.out.println("Current Balance: " + account.getBalance());
                    System.out.println("Withdraw Amount");
                    try {
                        account.withdraw(sc.nextInt());
                    } catch (InsufficientFundException e) {
                        System.out.println(e.toString());
                    }
                    break;
                case 3:
                    System.out.println("Current Balance: " + account.getBalance());
                    break;
            }
        } while (choice >= 1 && choice <= 3);
        System.out.println("Byee");
    }
}
