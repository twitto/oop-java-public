package exams.oop24b_scecs.moeda.q2_car_package;

// Luxury Sedan class, extends Sedan
public class LuxurySedan extends Sedan
{
    private TrimLevel trimLevel;

    public LuxurySedan(String licensePlate, String model, Color color, int year, TrimLevel trimLevel)
    {
        super(licensePlate, model, color, year);
        this.trimLevel = trimLevel;
    }

    @Override
    public void startEngine()
    {
        System.out.println("Vroom");
    }
}
