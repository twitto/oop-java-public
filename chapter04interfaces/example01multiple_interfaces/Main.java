package chapter04interfaces.example01multiple_interfaces;

public class Main
{
    public static void main(String[] args)
    {
        Bird bird = new Bird();
        bird.fly();  // Output: I'm flying!
        bird.walk();  // Output: I'm walking.

        Fish fish = new Fish();
        fish.swim();  // Output: I'm swimming!

        Penguin penguin = new Penguin();
        penguin.swim();  // Output: I'm swimming!
        penguin.walk();  // Output: I'm walking.

        Bat bat = new Bat();
        bat.fly();  // Output: I'm flying!
        bat.walk();  // Output: I'm walking.
    }
}
