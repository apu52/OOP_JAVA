import java.util.Scanner;

public class Point {
    private double x;
    private double y;

    // Constructor to initialize the point
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Getters for x and y
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    // Main method in the same class to create objects
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter x for point 1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Enter y for point 1: ");
        double y1 = scanner.nextDouble();

        System.out.print("Enter x for point 2: ");
        double x2 = scanner.nextDouble();
        System.out.print("Enter y for point 2: ");
        double y2 = scanner.nextDouble();

        Point p1 = new Point(x1, y1);
        Point p2 = new Point(x2, y2);

        System.out.println("Point 1: " + p1);
        System.out.println("Point 2: " + p2);

        scanner.close();
    }
}
