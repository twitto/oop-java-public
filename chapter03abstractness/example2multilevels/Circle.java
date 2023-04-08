package chapter03abstractness.example2multilevels;

public class Circle extends Shape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calcArea() {
        return Math.PI * radius * radius;
    }

    public double calcPerimeter() {
        return 2 * Math.PI * radius;
    }
}
