package chapter04interfaces.example01multiple_interfaces;

/**
 * Represents a penguin in the zoo.
 */
class Penguin extends Animal implements Swimmer, Walker
{
    public void swim()
    {
        System.out.println("I'm swimming!");
    }

    public void walk()
    {
        System.out.println("I'm walking.");
    }

    @Override
    public void makeSound()
    {
        System.out.println("honk honk.");
    }
}
