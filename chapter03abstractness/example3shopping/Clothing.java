package chapter03abstractness.example3shopping;

public class Clothing extends ShippableItem {
    protected String size;

    public Clothing(String name, double price, int quantity, String shippingAddress, String size) {
        super(name, price, quantity, shippingAddress);
        this.size = size;
    }

    @Override
    public double getShippingCost() {
        return 1.5 * quantity;
    }

    @Override
    public String getDescription() {
        return quantity + "x " + size + " " + name + " to be shipped to " + shippingAddress;
    }
}
