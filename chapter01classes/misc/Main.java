package chapter01classes.misc;
public class Main
{
    public static void main(String[] args)
    {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(3, 4);
        Point p3 = new Point(10, 20);

        System.out.println("Number of points created: " + Point.getNumOfPoints()); // Output: 2

        Point.setNumOfPoints(6);
        System.out.println("Number of points created: " + Point.getNumOfPoints()); // Output: 2
        p2.setX(23);

        p1.setNumOfPoints(10);
        System.out.println("Number of points created: " + Point.getNumOfPoints()); // Output: 2


        if (p1 instanceof Object)
            System.out.println("p1 is an Object");
        else
            System.out.println("p1 is not an Object");
    }
}
