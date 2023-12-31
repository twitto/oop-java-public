package exams.oop23b_scecs.oop23b_scecs_moedb.q2_shapes;

public abstract class Shape
{
    protected Color color;
    protected boolean filled;

    public Shape(Color color, boolean filled)
    {
        this.color = color;
        this.filled = filled;
    }

    public abstract double calculatePerimeter();
}
