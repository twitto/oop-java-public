package chapter02inheritance.example02vehicles;

// SportsCar.java
public class SportsCar extends Car
{
    private int maxAcceleration;

    public SportsCar(String name, int weight, int maxSpeed, int numDoors, boolean hasAirConditioning, int maxAcceleration)
    {
        super(name, weight, maxSpeed, numDoors, hasAirConditioning);
        this.maxAcceleration = maxAcceleration;
    }

    @Override
    public void drive()
    {
        super.drive(); // call drive() method in Car class
        System.out.println("Driving the " + name + " like a boss");
    }
}
