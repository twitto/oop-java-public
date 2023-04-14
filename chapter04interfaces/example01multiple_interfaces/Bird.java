package chapter04interfaces.example01multiple_interfaces;

/**
 * Represents a bird in the zoo.
 */
class Bird extends Animal implements Flyer, Walker
{
    public void fly()
    {
        System.out.println("I'm flying!");
    }

    public void walk()
    {
        System.out.println("I'm walking.");
    }

    @Override
    public void makeSound()
    {
        System.out.println("chirp chirp.");
    }
}
