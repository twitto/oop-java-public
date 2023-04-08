package chapter07exceptions.examples.example2bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Account> accounts;

    public Bank() {
        this.accounts = new ArrayList<Account>();
    }

    public void addAccount(Account account) {
        this.accounts.add(account);
    }

    public void transferMoney(Account from, Account to, double amount) throws Exception {
        from.withdraw(amount);
        to.deposit(amount);
    }

    public static void main(String[] args) {
        Bank bank = new Bank();
        Account acc1 = new Account(1001, 5000);
        Account acc2 = new Account(1002, 10000);
        bank.addAccount(acc1);
        bank.addAccount(acc2);
        try {
            bank.transferMoney(acc1, acc2, 7000);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("Account 1 balance: " + acc1.getBalance());
        System.out.println("Account 2 balance: " + acc2.getBalance());
    }
}