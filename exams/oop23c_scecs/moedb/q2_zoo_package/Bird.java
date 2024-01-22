package exams.oop23c_scecs.moedb.q2_zoo_package;

public class Bird extends Animal
{
    protected double wingspan;
    protected String feathersColor;

    public Bird(int id, String name, double wingspan, String feathersColor)
    {
        super(id, name);
        this.wingspan = wingspan;
        this.feathersColor = feathersColor;
    }

    @Override
    public void makeSound()
    {
        System.out.println("Sing");
    }
}
