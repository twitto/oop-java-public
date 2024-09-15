package exams.oop24b_scecs.moeda.q2_car_package;

// Abstract class representing a car
public abstract class Car {
    protected String licensePlate;
    protected String model;  // Full model name

    public Car(String licensePlate, String model) {
        this.licensePlate = licensePlate;
        this.model = model;
    }

    // Abstract method for starting the engine
    public abstract void startEngine();
}


