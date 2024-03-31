class Rectangle {
    private double length;
    private double width;

    // Constructor to initialize length and width
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Getter and setter methods for length
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    // Getter and setter methods for width
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    // Method to calculate area of the rectangle
    public double calculateArea() {
        return length * width;
    }

    // Method to calculate perimeter of the rectangle
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

public class RectangleTester {
    public static void main(String[] args) {
        // Create an object of the Rectangle class
        Rectangle myRectangle = new Rectangle(5.0, 8.0);

        // Display initial values
        System.out.println("Initial Length: " + myRectangle.getLength());
        System.out.println("Initial Width: " + myRectangle.getWidth());

        // Set new values for length and width using setter methods
        myRectangle.setLength(10.0);
        myRectangle.setWidth(6.0);

        // Display updated values
        System.out.println("\nUpdated Length: " + myRectangle.getLength());
        System.out.println("Updated Width: " + myRectangle.getWidth());

        // Calculate and display area and perimeter
        System.out.println("\nArea of the Rectangle: " + myRectangle.calculateArea());
        System.out.println("Perimeter of the Rectangle: " + myRectangle.calculatePerimeter());
    }
}
