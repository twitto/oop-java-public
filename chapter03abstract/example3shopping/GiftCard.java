package chapter03abstract.example3shopping;


public class GiftCard extends StoreItem {
    protected double balance;

    public GiftCard(String name, double price, double balance) {
        super(name, price);
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public double getTotalPrice() {
        return price;
    }

    @Override
    public String getDescription() {
        return "Gift card for " + name + " with a balance of $" + balance;
    }
}
