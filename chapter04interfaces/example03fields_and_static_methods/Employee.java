package chapter04interfaces.example03fields_and_static_methods;

public class Employee implements Person
{
    private String name;
    private int age;

    public Employee(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    @Override
    public void walk()
    {
        System.out.println(name + " is walking to their office.");
    }

    @Override
    public void talk()
    {
        System.out.println(name + " is speaking with a customer.");
    }
}
