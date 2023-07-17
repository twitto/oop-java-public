package chapter01classes.point;

public class Main2
{
    public static void main(String[] args)
    {
        // Create an array of Point objects
        Point[] points = new Point[3];

        // Initialize the array elements with Point objects
        points[0] = new Point(2.5, 3.7);
        points[1] = new Point(1.2, 4.6);
        points[2] = new Point(3.8, 2.1);

        // Print the coordinates of each point in the array
        for (int i = 0; i < points.length; i++) {
            System.out.println("Coordinates of point " + (i + 1) + ": " + points[i].toString());
        }

        // Calculate the distance between the first and second points
        double distance = points[0].distanceTo(points[1]);
        System.out.println("Distance between point 1 and point 2: " + distance);

        // Calculate the absolute distance from the origin to the third point
        double absDistance = points[2].abs();
        System.out.println("Absolute distance from the origin to point 3: " + absDistance);
    }
}
