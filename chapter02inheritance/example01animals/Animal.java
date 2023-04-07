package chapter02inheritance.example01animals;

public class Animal
{
    protected String name;
    protected int age;

    public Animal(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public void eat()
    {
        System.out.println("The animal is eating");
    }

    public void sleep()
    {
        System.out.println("The animal is sleeping");
    }

    public String getName()
    {
        return name;
    }
}
