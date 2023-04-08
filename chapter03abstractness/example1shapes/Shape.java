package chapter03abstractness.example1shapes;

public abstract class Shape
{
    protected int base;
    protected int height;

    public Shape(int base, int height)
    {
        this.base = base;
        this.height = height;
    }

    public abstract double area();
}

