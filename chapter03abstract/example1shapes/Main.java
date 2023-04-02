package chapter03abstract.example1shapes;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 20);
        System.out.println("Area of rectangle: " + rectangle.area());

        Triangle triangle = new Triangle(5, 10);
        System.out.println("Area of triangle: " + triangle.area());
    }
}
