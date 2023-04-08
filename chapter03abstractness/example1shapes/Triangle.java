package chapter03abstractness.example1shapes;

public class Triangle extends Shape
{
    public Triangle(int base, int height)
    {
        super(base, height);
    }

    public double area()
    {
        return (base * height) / 2;
    }
}
