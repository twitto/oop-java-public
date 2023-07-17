package chapter01classes.point;

/**
 * The Point class represents a 2D point with x and y coordinates.
 */
public class Point {
    private final double DEFAULT_X = 0.0;
    private final double DEFAULT_Y = 0.0;
    private double x;
    private double y;

    /**
     * Constructs a Point object with the specified x and y coordinates.
     *
     * @param x the x-coordinate of the point
     * @param y the y-coordinate of the point
     */
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Constructs a Point object with the default x and y coordinates (0, 0).
     */
    public Point() {
        this.x = DEFAULT_X;
        this.y = DEFAULT_Y;
    }

    /**
     * Returns the x-coordinate of this point.
     *
     * @return the x-coordinate
     */
    public double getX() {
        return x;
    }

    /**
     * Returns the y-coordinate of this point.
     *
     * @return the y-coordinate
     */
    public double getY() {
        return y;
    }

    /**
     * Sets the x-coordinate of this point to the specified value.
     *
     * @param x the new x-coordinate
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * Sets the y-coordinate of this point to the specified value.
     *
     * @param y the new y-coordinate
     */
    public void setY(double y) {
        this.y = y;
    }

    /**
     * Calculates the distance between this point and another point.
     *
     * @param other the other point
     * @return the distance between this point and the other point
     */
    public double distanceTo(Point other) {
        double dx = this.x - other.x;
        double dy = this.y - other.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    /**
     * Returns the absolute distance from the origin (0, 0) to this point.
     *
     * @return the absolute distance from the origin to this point
     */
    public double abs() {
        return Math.sqrt(x * x + y * y);
    }

    /**
     * Returns a string representation of this point in the format "(x, y)".
     *
     * @return a string representation of this point
     */
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    /**
     * Compares this point to the specified object. The result is true if and only if the
     * argument is not null and represents the same point with the same coordinates.
     *
     * @param obj the object to compare
     * @return true if the given object is equal to this point, false otherwise
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Point other = (Point) obj;
        return Double.compare(other.x, x) == 0 && Double.compare(other.y, y) == 0;
    }
}

