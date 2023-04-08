package chapter03abstractness.example3shopping;

public abstract class ShippableItem extends CartItem
{
    protected String shippingAddress;

    public ShippableItem(String name, double price, int quantity, String shippingAddress)
    {
        super(name, price, quantity);
        this.shippingAddress = shippingAddress;
    }

    public abstract double getShippingCost();

    @Override
    public double getTotalCost()
    {
        return getTotalPrice() + getShippingCost();
    }

    @Override
    public String getDescription()
    {
        return quantity + "x " + name + " to be shipped to " + shippingAddress;
    }
}
