package chapter01classes.car;

public class Main2 {
    public static void main(String[] args) {
        // Create an array of Car objects
        Car[] cars = new Car[3];

        // Initialize the cars array with different car objects
        cars[0] = new Car("Toyota Camry", 12345, "Silver");
        cars[1] = new Car("Honda Civic", 54321, "Blue");
        cars[2] = new Car("Tesla Model S", 98765, "Red");

        // Print the details of each car in the array
        for (Car car : cars) {
            System.out.println(car);
        }

        // Update the color of the second car
        cars[1].setColor("Green");

        // Print the updated details of the second car
        System.out.println("Updated details of the second car:");
        System.out.println(cars[1]);
    }
}

