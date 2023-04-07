package chapter03abstractness.example3shopping;

class Book extends ShippableItem {
    protected String author;

    public Book(String name, double price, int quantity, String shippingAddress, String author) {
        super(name, price, quantity, shippingAddress);
        this.author = author;
    }

    @Override
    public double getShippingCost() {
        return 2.5 * quantity;
    }

    @Override
    public String getDescription() {
        return quantity + "x " + name + " by " + author + " to be shipped to " + shippingAddress;
    }
}
