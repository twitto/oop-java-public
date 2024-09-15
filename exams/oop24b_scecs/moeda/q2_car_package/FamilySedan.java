package exams.oop24b_scecs.moeda.q2_car_package;

// Family Sedan class, extends Sedan
public class FamilySedan extends Sedan
{

    public FamilySedan(String licensePlate, String model, Color color, int year)
    {
        super(licensePlate, model, color, year);
    }

    @Override
    public void startEngine()
    {
        System.out.println("Purr");
    }
}
