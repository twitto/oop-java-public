package chapter04interfaces.example02extending_interfaces;

public class Main
{
    public static void main(String[] args)
    {
        ResizableDrawable rectangle = new Rectangle(10, 5);
        rectangle.draw();
        rectangle.resize(2.0);
        rectangle.draw();

        ResizableDrawable circle = new Circle(3);
        circle.draw();
        circle.resize(1.5);
        circle.draw();

        Drawable button = new Button("Click me");
        button.draw();
    }
}

