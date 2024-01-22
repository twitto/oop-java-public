package exams.oop23c_scecs.moedb.q2_zoo_package;

public abstract class HerbivoreMammal extends Mammal
{
    protected Diet diet;
    public HerbivoreMammal(int id, String name, double weight, double age, Diet diet)
    {
        super(id, name, weight, age);
        this.diet = diet;
    }
}
