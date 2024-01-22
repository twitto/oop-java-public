package exams.oop23c_scecs.moedb.q2_zoo_package;

public abstract class Animal
{
    protected int id;
    protected String name;

    public Animal(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    public abstract void makeSound();
}
