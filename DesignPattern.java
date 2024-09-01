import java.util.Scanner;

public class DesignPattern {

    // Static method to draw a triangle
    public static void drawTriangle(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(); 
        }
    }

    // Static method to draw a rectangle
    public static void drawRectangle(int width, int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                System.out.print("* ");
            }
            System.out.println(); 
        }
    }

    // Static method to draw a square
    public static void drawSquare(int side) {
        for (int i = 1; i <= side; i++) {
            for (int j = 1; j <= side; j++) {
                System.out.print("* ");
            }
            System.out.println(); 
        }
    }

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the height of the triangle: ");
        int triangleHeight = scanner.nextInt();
        System.out.println("Triangle:");
        drawTriangle(triangleHeight);

       
        System.out.print("Enter the width of the rectangle: ");
        int rectangleWidth = scanner.nextInt();
        System.out.print("Enter the height of the rectangle: ");
        int rectangleHeight = scanner.nextInt();
        System.out.println("Rectangle:");
        drawRectangle(rectangleWidth, rectangleHeight);

       
        System.out.print("Enter the side length of the square: ");
        int squareSide = scanner.nextInt();
        System.out.println("Square:");
        drawSquare(squareSide);

        scanner.close(); 
    }
}
