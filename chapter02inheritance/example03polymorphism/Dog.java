package chapter02inheritance.example03polymorphism;

class Dog extends Animal
{
    @Override
    void makeSound()
    {
        System.out.println("The dog barks");
    }
}
