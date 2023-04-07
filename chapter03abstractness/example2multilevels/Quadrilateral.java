package chapter03abstractness.example2multilevels;

public abstract class Quadrilateral extends Shape
{
    protected double side1, side2, side3, side4;

    public Quadrilateral(double s1, double s2, double s3, double s4)
    {
        this.side1 = s1;
        this.side2 = s2;
        this.side3 = s3;
        this.side4 = s4;
    }

    public double calcPerimeter()
    {
        return side1 + side2 + side3 + side4;
    }
}
