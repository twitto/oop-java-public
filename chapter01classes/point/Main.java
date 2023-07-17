package chapter01classes.point;

public class Main {
    public static void main(String[] args) {
        // Create a Point object with coordinates (2.5, 3.7)
        Point point1 = new Point(2.5, 3.7);

        // Print the coordinates of point1
        System.out.println("Coordinates of point1: (" + point1.getX() + ", " + point1.getY() + ")");

        // Create a default Point object with coordinates (0.0, 0.0)
        Point point2 = new Point();

        // Print the coordinates of point2
        System.out.println("Coordinates of point2: (" + point2.getX() + ", " + point2.getY() + ")");

        // Set the x-coordinate of point2 to 1.2
        point2.setX(1.2);

        // Set the y-coordinate of point2 to 4.6
        point2.setY(4.6);

        // Print the updated coordinates of point2
        System.out.println("Updated coordinates of point2: (" + point2.getX() + ", " + point2.getY() + ")");

        // Calculate the distance between point1 and point2
        double distance = point1.distanceTo(point2);
        System.out.println("Distance between point1 and point2: " + distance);

        // Calculate the absolute distance from the origin to point1
        double absDistance = point1.abs();
        System.out.println("Absolute distance from the origin to point1: " + absDistance);

        // Check if point1 is equal to point2
        boolean isEqual = point1.equals(point2);
        System.out.println("Are point1 and point2 equal? " + isEqual);

        // Create another Point object with the same coordinates as point1
        Point point3 = new Point(2.5, 3.7);

        // Check if point1 is equal to point3
        isEqual = point1.equals(point3);
        System.out.println("Are point1 and point3 equal? " + isEqual);
    }
}

