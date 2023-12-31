package exams.oop23b_scecs.oop23b_scecs_moedb.q2_shapes;

public class Triangle extends Shape
{
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(Color color, boolean filled, double sideA, double sideB, double sideC)
    {
        super(color, filled);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double calculatePerimeter()
    {
        return sideA + sideB + sideC;
    }
}
