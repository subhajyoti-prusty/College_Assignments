class Point {
    private int x;
    private int y;

    // Parameterized constructor
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Copy constructor
    public Point(Point otherPoint) {
        this.x = otherPoint.getX();
        this.y = otherPoint.getY();
    }

    // Getter and setter methods for x
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    // Getter and setter methods for y
    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

public class PointTester {
    public static void main(String[] args) {
        // Create a new Point object
        Point point1 = new Point(5, 10);

        // Display the initial coordinates
        System.out.println("Initial coordinates of point1:");
        System.out.println("X: " + point1.getX());
        System.out.println("Y: " + point1.getY());

        // Create a copy of point1 using the copy constructor
        Point point2 = new Point(point1);

        // Modify the coordinates of point2
        point2.setX(20);
        point2.setY(30);

        // Display the coordinates of both points
        System.out.println("\nCoordinates of point1 after modifying point2:");
        System.out.println("X: " + point1.getX());
        System.out.println("Y: " + point1.getY());

        System.out.println("\nCoordinates of point2:");
        System.out.println("X: " + point2.getX());
        System.out.println("Y: " + point2.getY());
    }
}
