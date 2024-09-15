package exams.oop24b_scecs.moeda.q2_car_package;

public class Main {
    public static void main(String[] args) {
        // Creating instances of LuxurySedan
        LuxurySedan audiA8 = new LuxurySedan("1234AB", "Audi A8", Color.BLACK, 2022, TrimLevel.PREMIUM);
        LuxurySedan mercedesSClass = new LuxurySedan("5678CD", "Mercedes S-Class", Color.WHITE, 2023, TrimLevel.ADVANCED);

        // Creating instances of FamilySedan
        FamilySedan toyotaCorolla = new FamilySedan("91011EF", "Toyota Corolla", Color.RED, 2021);
        FamilySedan hondaCivic = new FamilySedan("12131GH", "Honda Civic", Color.BLUE, 2022);

        // Creating instances of Jeep and Land Rover
        Jeep jeepWrangler = new Jeep("13141IJ", "Jeep Wrangler", 8);
        LandRover landRoverDefender = new LandRover("15161JK", "Land Rover Defender", 9);

        // Starting engines and printing the respective messages
        System.out.println("Starting engines:");

        audiA8.startEngine();           // Expected output: Vroom
        mercedesSClass.startEngine();   // Expected output: Vroom

        toyotaCorolla.startEngine();    // Expected output: Purr
        hondaCivic.startEngine();       // Expected output: Purr

        jeepWrangler.startEngine();     // Expected output: Roar
        landRoverDefender.startEngine(); // Expected output: Roar
    }
}
