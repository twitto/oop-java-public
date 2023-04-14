package chapter04interfaces.example03fields_and_static_methods;

public class Main
{
    public static void main(String[] args)
    {
        Employee employee = new Employee("John", 25);
        Customer customer = new Customer("Alice", 35);

        employee.walk();
        employee.talk();
        double employeeAge = Person.getRandomAge();
        System.out.println("Employee's random age: " + employeeAge);

        customer.walk();
        customer.talk();
        double customerAge = Person.getRandomAge();
        System.out.println("Customer's random age: " + customerAge);
    }
}
