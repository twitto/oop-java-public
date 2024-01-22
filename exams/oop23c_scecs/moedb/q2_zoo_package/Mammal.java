package exams.oop23c_scecs.moedb.q2_zoo_package;

public abstract class Mammal extends Animal
{
    protected double weight;
    protected double age;

    public Mammal(int id, String name, double weight, double age)
    {
        super(id, name);
        this.weight = weight;
        this.age = age;
    }
}
