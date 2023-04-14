package chapter04interfaces.example03fields_and_static_methods;

public class Customer implements Person
{
    private String name;
    private int age;

    public Customer(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    @Override
    public void walk()
    {
        System.out.println(name + " is browsing the store.");
    }

    @Override
    public void talk()
    {
        System.out.println(name + " is asking for assistance.");
    }
}
