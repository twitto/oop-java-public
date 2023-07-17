package chapter01classes.car;

public class Main {
    public static void main(String[] args) {
        // Create car objects using different constructors
        Car car1 = new Car();
        Car car2 = new Car("Toyota Camry", 12345);
        Car car3 = new Car("Tesla Model S", 98765, "Red");

        // Print the car details using toString()
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);

        // Compare car objects using equals()
        System.out.println("car1 equals car2: " + car1.equals(car2));
        System.out.println("car2 equals car3: " + car2.equals(car3));

        // Update car attributes using setter methods
        car1.setModel("Honda Civic");
        car1.setId(54321);
        car1.setColor("Blue");

        // Print the updated car details
        System.out.println(car1);
    }
}

