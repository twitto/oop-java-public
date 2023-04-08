package chapter02inheritance.example01animals;

public class Main
{
    public static void main(String[] args)
    {
        Dog dog = new Dog("Rufus", 7, "Labrador");
        Cat cat = new Cat("Fluffy", 3, "gray");
        System.out.println("Dog name: " + dog.getName() + ", breed: " + dog.getBreed());
        dog.bark();
        dog.setBreed("Golden Retriever");
        System.out.println("New breed: " + dog.getBreed());
        System.out.println("Cat name: " + cat.getName() + ", color: " + cat.getColor());
        cat.meow();
        cat.setColor("orange");
        System.out.println("New color: " + cat.getColor());
    }
}

