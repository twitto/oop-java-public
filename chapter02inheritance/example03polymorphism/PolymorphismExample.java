package chapter02inheritance.example03polymorphism;

public class PolymorphismExample
{
    public static void main(String[] args)
    {
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();

        AnimalSounds.makeAnimalSound(animal); // The animal makes a sound
        AnimalSounds.makeAnimalSound(dog);   // The dog barks
        AnimalSounds.makeAnimalSound(cat);   // The cat meows
    }
}
