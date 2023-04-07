package chapter03abstractness.example2multilevels;

public class Rectangle extends Quadrilateral {
    public Rectangle(double length, double width) {
        super(length, width, length, width);
    }
    public double calcArea() {
        return side1 * side2;
    }
}
