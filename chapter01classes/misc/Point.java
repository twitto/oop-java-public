package chapter01classes.misc;

public class Point {
    private int x;
    private int y;
    private static int numOfPoints = 0;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
        numOfPoints++; // Increment the static field for each new Point object created
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public static int getNumOfPoints() {
        return numOfPoints;
    }

    public static void setNumOfPoints(int numOfPoints) {
        Point.numOfPoints = numOfPoints;
    }
}

