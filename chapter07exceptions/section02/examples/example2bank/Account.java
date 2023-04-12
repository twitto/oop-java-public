package chapter07exceptions.section02.examples.example2bank;

class Account
{
    private int accountNumber;
    private double balance;

    public Account(int accountNumber, double balance)
    {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public int getAccountNumber()
    {
        return accountNumber;
    }

    public double getBalance()
    {
        return balance;
    }

    public void deposit(double amount)
    {
        this.balance += amount;
    }

    public void withdraw(double amount) throws InsufficientFundsException
    {
        if (this.balance < amount) {
            throw new InsufficientFundsException("Insufficient funds in account " + this.accountNumber);
        }
        this.balance -= amount;
    }
}
