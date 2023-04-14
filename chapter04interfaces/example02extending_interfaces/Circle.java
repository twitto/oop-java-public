package chapter04interfaces.example02extending_interfaces;

public class Circle implements ResizableDrawable
{
    private double radius;

    public Circle(double radius)
    {
        this.radius = radius;
    }

    @Override
    public void draw()
    {
        System.out.println("Drawing a circle with radius " + radius);
    }

    @Override
    public void resize(double scaleFactor)
    {
        radius *= scaleFactor;
        System.out.println("Resizing circle to radius " + radius);
    }
}
