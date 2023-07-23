package chapter01classes.misc;

public class BankAccount
{
    private static int nextAccountNumber = 1000; // Static field to manage the next account number
    private int accountNumber;
    private double balance;
    private String accountHolderName;

    public BankAccount(String accountHolderName) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = nextAccountNumber++; // Assign the next available account number and increment for the next account
        this.balance = 0.0; // Initializing balance to zero
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit of $" + amount + " successful. New balance: $" + balance);
        } else {
            System.out.println("Invalid deposit amount. Deposit amount must be greater than zero.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawal of $" + amount + " successful. New balance: $" + balance);
            } else {
                System.out.println("Insufficient funds. Withdrawal amount exceeds account balance.");
            }
        } else {
            System.out.println("Invalid withdrawal amount. Withdrawal amount must be greater than zero.");
        }
    }

    @Override
    public String toString() {
        return "Account Number: " + accountNumber +
                ", Account Holder Name: " + accountHolderName +
                ", Balance: $" + balance;
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("John Doe");
        BankAccount account2 = new BankAccount("Jane Smith");

        System.out.println(account1);
        System.out.println(account2);

        account1.deposit(1000);
        account2.deposit(500);

        account1.withdraw(200);
        account2.withdraw(700);

        System.out.println(account1);
        System.out.println(account2);
    }
}
