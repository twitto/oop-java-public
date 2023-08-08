package exams.oop23b_scecs_moedb.q2_shapes;

public class Rectangle extends Shape
{
    private double width;
    private double height;

    public Rectangle(Color color, boolean filled, double width, double height)
    {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double calculatePerimeter()
    {
        return 2 * (width + height);
    }
}
