package chapter03abstractness.example3shopping;

public abstract class StoreItem {
    protected String name;
    protected double price;

    public StoreItem(String name, double price) {
        this.name = name;
        this.price = price;
    }
    //public abstract double getTotalPrice();

    public abstract String getDescription();
}

