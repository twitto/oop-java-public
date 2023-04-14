package chapter04interfaces.example02extending_interfaces;

public class Rectangle implements ResizableDrawable
{
    private double width;
    private double height;

    public Rectangle(double width, double height)
    {
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw()
    {
        System.out.println("Drawing a rectangle with width " + width + " and height " + height);
    }

    @Override
    public void resize(double scaleFactor)
    {
        width *= scaleFactor;
        height *= scaleFactor;
        System.out.println("Resizing rectangle to width " + width + " and height " + height);
    }
}
