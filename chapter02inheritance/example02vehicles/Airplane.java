package chapter02inheritance.example02vehicles;

// Airplane.java
public class Airplane extends Vehicle
{
    private int wingspan;
    private int numEngines;

    public Airplane(String name, int weight, int maxSpeed, int wingspan, int numEngines)
    {
        super(name, weight, maxSpeed);
        this.wingspan = wingspan;
        this.numEngines = numEngines;
    }

    @Override
    public void drive()
    {
        super.drive(); // call drive() method in Vehicle class
        System.out.println("Flying the " + name + " in the sky");
    }
}
