import java.util.Scanner;

// Class to represent a point in a 2D plane
class Point {
    private double x; // X coordinate
    private double y; // Y coordinate

    // Default constructor
    public Point() {
        this.x = 0;
        this.y = 0;
    }

    // Constructor with parameters
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Method to set the coordinates of the point
    public void setCoordinates(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Method to display the coordinates of the point
    public void display() {
        System.out.println("Point coordinates: (" + x + ", " + y + ")");
    }
}

// Main class to create and manage Point objects
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a Point object using the default constructor
        Point point1 = new Point();
        System.out.println("Default Point:");
        point1.display();

        // Create a Point object using the parameterized constructor
        Point point2 = new Point(5.5, 6.6);
        System.out.println("Parameterized Point:");
        point2.display();

        // Prompt user to enter coordinates for a new Point
        System.out.print("Enter X coordinate for a new point: ");
        double x = scanner.nextDouble();
        System.out.print("Enter Y coordinate for a new point: ");
        double y = scanner.nextDouble();

        // Create a Point object with user-provided coordinates
        Point point3 = new Point();
        point3.setCoordinates(x, y);
        System.out.println("User-defined Point:");
        point3.display();

        scanner.close();
    }
}
