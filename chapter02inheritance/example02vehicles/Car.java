package chapter02inheritance.example02vehicles;

// Car.java
public class Car extends Vehicle
{
    protected int numDoors;
    protected boolean hasAirConditioning;

    public Car(String name, int weight, int maxSpeed, int numDoors, boolean hasAirConditioning)
    {
        super(name, weight, maxSpeed);
        this.numDoors = numDoors;
        this.hasAirConditioning = hasAirConditioning;
    }

    @Override
    public void drive()
    {
        //super.drive(); // call drive() method in Vehicle class
        System.out.println("Driving the " + name + " on the road");
    }
}
