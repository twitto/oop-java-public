package exams.oop23c_scecs.moedb.q2_zoo_package;

public class Deer extends HerbivoreMammal
{
    public Deer(int id, String name, double weight, double age, Diet diet)
    {
        super(id, name, weight, age, diet);
    }

    @Override
    public void makeSound()
    {
        System.out.println("Grunt");
    }
}
