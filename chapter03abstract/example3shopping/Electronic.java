package chapter03abstract.example3shopping;

public class Electronic extends CartItem {
    protected String brand;
    protected String model;
    protected int warrantyPeriod;

    public Electronic(String name, double price, int quantity, String brand, String model, int warrantyPeriod) {
        super(name, price, quantity);
        this.brand = brand;
        this.model = model;
        this.warrantyPeriod = warrantyPeriod;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }

    @Override
    public double getTotalCost() {
        return getTotalPrice();
    }

    @Override
    public String getDescription() {
        return quantity + "x " + brand + " " + model + " (" + name + ") with " + warrantyPeriod + " months warranty";
    }
}
