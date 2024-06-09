package chapter01classes.car;

//import chapter01classes.school.Student;

public class Main
{
    public static void main(String[] args)
    {
        //Student s = new Student("abc", 22);
        //s.setName("bob");

        Math.random();

        double d = 7;
        double d2 = 3.14;
        //int i = 2.71;

        Object x = new Object(); // a:4000

        x = new Car();  // a:7000
        Object x3 = "abc";
        Object x4 = 2;

        double d3 = Math.random();

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

