package chapter02inheritance.example02vehicles;

public class Main2 {
    public static void main(String[] args) {
        Vehicle[] myVehicles = new Vehicle[5];
        myVehicles[0] = new Car("Ford Focus", 1500, 200, 4, true);
        myVehicles[1] = new Ship("Queen Mary 2", 90000, 30, 12, true);
        myVehicles[2] = new Airplane("Boeing 747", 400000, 570, 68, 4);
        myVehicles[3] = new SportsCar("Ferrari 488", 1420, 330, 2, false, 0);
        myVehicles[4] = new ElectricCar("Tesla Model S", 2250, 250, 4, true, 500);
        for (Vehicle vehicle : myVehicles) {
            vehicle.drive();
        }
    }
}


