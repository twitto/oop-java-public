package chapter01classes.misc;

// Simple class with default constructor, default toString(), and default equals()
class Person {
    private String name;
    private int age;

    // Default constructor
//    public Person() {
//        // Default constructor does not take any arguments
//        // We can initialize instance variables to some default values here
//        name = "Unknown";
//        age = 0;
//    }

    // Parameterized constructor
//    public Person(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }

    // Default toString() method
    // This method will be called when we try to print the object or use it in string concatenation
    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }

    // Default equals() method
    // This method checks if two objects have the same reference (i.e., same memory location)
    // We will override it later to provide custom comparison based on name and age



    public static void main(String[] args) {
        // Creating objects using default constructor
        Person person1 = new Person(); // Using default constructor
        //Person person2 = new Person("Alice", 30); // Using parameterized constructor

        // Printing objects using default toString()
        System.out.println("Person 1: " + person1);
        //System.out.println("Person 2: " + person2);

        // Comparing objects using default equals()
        //System.out.println("person1 == person2: " + (person1.equals(person2)));

  }

}



