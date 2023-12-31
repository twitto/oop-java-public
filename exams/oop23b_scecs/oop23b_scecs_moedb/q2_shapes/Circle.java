package exams.oop23b_scecs.oop23b_scecs_moedb.q2_shapes;

public class Circle extends Shape
{
    private double radius;

    public Circle(Color color, boolean filled, double radius)
    {
        super(color, filled);
        this.radius = radius;
    }

    public double calculatePerimeter()
    {
        return 2 * Math.PI * radius;
    }
}

