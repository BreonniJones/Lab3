package shapePack;

public class Rectangle extends Shape {
    private double length;
    private double width;

    // Constructor for initializing length and width
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void calculateArea() {
        double area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }

    // Method to set new dimensions if needed
    public void setDimensions(double length, double width) {
        this.length = length;
        this.width = width;
    }
}
