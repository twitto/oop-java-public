package exams.oop24b_scecs.moeda.q2_car_package;

// Abstract class representing a sedan, extends Car
public abstract class Sedan extends Car
{
    protected Color color;
    protected int year;

    public Sedan(String licensePlate, String model, Color color, int year)
    {
        super(licensePlate, model);
        this.color = color;
        this.year = year;
    }
}
