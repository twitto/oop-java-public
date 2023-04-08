package chapter02inheritance.example02vehicles;

// ElectricCar.java
public class ElectricCar extends Car
{
    private int range;

    public ElectricCar(String name, int weight, int maxSpeed, int numDoors, boolean hasAirConditioning, int range)
    {
        super(name, weight, maxSpeed, numDoors, hasAirConditioning);
        this.range = range;
    }

    @Override
    public void drive()
    {
        super.drive(); // call drive() method in Car class
        System.out.println("Driving the " + name + " silently");
    }
}
