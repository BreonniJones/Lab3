package shapePack;

public class Square extends Shape {
    private double side;

    // Constructor to initialize side length
    public Square(double side) {
        this.side = side;
    }

    // Method to calculate the area
    @Override
    public void calculateArea() {
        double area = side * side;
        System.out.println("Area of Square: " + area);
    }

    // Setter and Getter for side
    public void setSide(double side) {
        this.side = side;
    }
    
    public double getSide() {
        return side;
    }
}
