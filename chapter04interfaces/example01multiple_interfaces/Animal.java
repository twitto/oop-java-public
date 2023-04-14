package chapter04interfaces.example01multiple_interfaces;

public abstract class Animal
{
    public void eat()
    {
        System.out.println("I'm eating!");
    }
    public void sleep()
    {
        System.out.println("I'm sleeping!");
    }

    public abstract void makeSound();
}
