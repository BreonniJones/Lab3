package shapeProcess;

import shapePack.Square;
import shapePack.semiCircle;

public class shapeExecute {
    public static void main(String[] args) {
        // Creating an object of Square
        Square square = new Square();
        square.printSquare();       // This is Square. Subclass of Rectangle
        square.printRectangle();    // This is Rectangle. Subclass of Shape
        square.printShape();        // This is Shape

        // Creating an object of SemiCircle
        semiCircle semiCircle = new semiCircle();
        semiCircle.printSemiCircle();  // This is SemiCircle. Subclass of Circle
        semiCircle.printCircle();      // This is Circle. Subclass of Shape
        semiCircle.printShape();       // This is Shape
    }
}
