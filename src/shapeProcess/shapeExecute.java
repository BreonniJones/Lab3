package shapeProcess;

import shapePack.Square;
import shapePack.Rectangle;
import java.util.Scanner;

public class shapeExecute {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for side length and create Square object with it
        System.out.print("Enter the side length of the square: ");
        double squareSide = scanner.nextDouble();
        Square square = new Square(squareSide);  // Pass side length here

        // Calculate and display the area of the square
        square.calculateArea();

        // Prompt for dimensions of the rectangle
        System.out.print("Enter the length of the rectangle: ");
        double rectangleLength = scanner.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        double rectangleWidth = scanner.nextDouble();

        // Use the rectangle dimensions to create a Rectangle object
        Rectangle rectangle = new Rectangle(rectangleLength, rectangleWidth);
        rectangle.calculateArea();

        scanner.close();
    }
}
