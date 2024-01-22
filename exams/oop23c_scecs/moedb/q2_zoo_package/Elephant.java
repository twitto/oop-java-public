package exams.oop23c_scecs.moedb.q2_zoo_package;

public class Elephant extends HerbivoreMammal
{
    protected double trunkLength;

    public Elephant(int id, String name, double weight, double age, Diet diet, double trunkLength)
    {
        super(id, name, weight, age, diet);
        this.trunkLength = trunkLength;
    }

    @Override
    public void makeSound()
    {
        System.out.println("Trump");
    }
}
