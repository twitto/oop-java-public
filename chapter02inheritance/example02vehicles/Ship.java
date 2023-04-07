package chapter02inheritance.example02vehicles;

// Ship.java
public class Ship extends Vehicle
{
    private int numDecks;
    private boolean hasLifeboats;

    public Ship(String name, int weight, int maxSpeed, int numDecks, boolean hasLifeboats)
    {
        super(name, weight, maxSpeed);
        this.numDecks = numDecks;
        this.hasLifeboats = hasLifeboats;
    }

    @Override
    public void drive()
    {
        super.drive(); // call drive() method in Vehicle class
        System.out.println("Sailing the " + name + " on the sea");
    }
}
