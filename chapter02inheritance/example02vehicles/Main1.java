package chapter02inheritance.example02vehicles;

public class Main1 {
    public static void main(String[] args) {
        Car myCar = new Car("Ford Focus", 1500, 200, 4, true);
        Ship myShip = new Ship("Queen Mary 2", 90000, 30, 12, true);
        Airplane myAirplane = new Airplane("Boeing 747", 400000, 570, 68, 4);
        SportsCar mySportsCar = new SportsCar("Ferrari 488", 1420, 330, 2, false, 0);
        ElectricCar myElectricCar = new ElectricCar("Tesla Model S", 2250, 250, 4, true, 500);

        myCar.drive();
        myShip.drive();
        myAirplane.drive();
        mySportsCar.drive();
        myElectricCar.drive();
    }
}

