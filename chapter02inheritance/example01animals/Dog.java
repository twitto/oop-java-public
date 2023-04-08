package chapter02inheritance.example01animals;

public class Dog extends Animal
{
    private String breed;

    public Dog(String name, int age, String breed)
    {
        super(name, age);
        this.breed = breed;
    }

    public void bark()
    {
        System.out.println("Woof!");
    }

    public String getBreed()
    {
        return breed;
    }

    public void setBreed(String breed)
    {
        this.breed = breed;
    }
}

