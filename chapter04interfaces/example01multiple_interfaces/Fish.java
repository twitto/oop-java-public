package chapter04interfaces.example01multiple_interfaces;

/**
 * Represents a fish in the zoo.
 */
class Fish extends Animal implements Swimmer
{
    public void swim()
    {
        System.out.println("I'm swimming!");
    }

    @Override
    public void makeSound()
    {
        System.out.println("blub blub.");
    }
}
