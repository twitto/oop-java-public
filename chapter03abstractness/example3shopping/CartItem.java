package chapter03abstractness.example3shopping;

public abstract class CartItem extends StoreItem
{
    protected int quantity;

    public CartItem(String name, double price, int quantity)
    {
        super(name, price);
        this.quantity = quantity;
    }

    public abstract double getTotalCost();

    public double getTotalPrice()
    {
        return price * quantity;
    }
}
