package exams.oop23c_scecs.moeda.q1_city_class;

public class Main {
    public static void main(String[] args) {
        // Create city instances
        City paris = new City("Paris", 2200000, "France", true);
        City berlin = new City("Berlin", 3500000, "Germany", true);

        // Display initial city details
        System.out.println("Initial Paris details:");
        System.out.println(paris.toString());

        // Update and display Paris's population
        try {
            paris.updatePopulation(50000);
            System.out.println("\nUpdated Paris population: " + paris.toString());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // Update and display Berlin's name
        try {
            berlin.updateCityName("Berlin Updated");
            System.out.println("\nUpdated Berlin name: " + berlin.toString());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // Check equality between two cities
        System.out.println("\nAre Paris and Berlin equal? " + paris.equals(berlin));

        // Create a copy of Berlin
        City berlinCopy = new City("Berlin", 3500000, "Germany", true);

        // Check equality between Berlin and its copy
        System.out.println("\nAre the two Berlin cities equal? " + berlin.equals(berlinCopy));
    }
}

