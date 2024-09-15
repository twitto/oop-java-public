package exams.oop24b_scecs.moeda.q2_car_package;

// Abstract class representing an SUV, extends Car
public class SUV extends Car
{
    protected int offRoadCapability;

    public SUV(String licensePlate, String model, int offRoadCapability)
    {
        super(licensePlate, model);
        this.offRoadCapability = offRoadCapability;
    }

    @Override
    public void startEngine()
    {
        System.out.println("Roar");
    }
}
