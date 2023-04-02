package chapter03abstract.example1shapes;

public class Rectangle extends Shape {
    public Rectangle(int base, int height) {
        super(base, height);
    }

    public double area() {
        return base * height;
    }
}
