package chapter02inheritance.example02vehicles;

// Vehicle.java
public class Vehicle
{
    protected String name;
    protected int weight;
    protected int maxSpeed;

    public Vehicle(String name, int weight, int maxSpeed)
    {
        this.name = name;
        this.weight = weight;
        this.maxSpeed = maxSpeed;
    }

    public void drive()
    {
        System.out.println("Driving the " + name);
    }
}

