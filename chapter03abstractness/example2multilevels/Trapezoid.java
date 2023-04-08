package chapter03abstractness.example2multilevels;

public class Trapezoid extends Quadrilateral
{
    private final double height;

    public Trapezoid(double top, double bottom, double left, double right, double height)
    {
        super(top, bottom, left, right);
        this.height = height;
    }

    public double calcArea()
    {
        return ((side1 + side2) / 2) * height;
    }
}
