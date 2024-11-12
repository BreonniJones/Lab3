package shapePack;

public class semiCircle extends Circle {
    private double radius;

    // Constructor to initialize radius
    public semiCircle(double radius) {
        this.radius = radius;
    }

    // Method to print information about SemiCircle
    public void printSemiCircle() {
        System.out.println("This is SemiCircle. Subclass of Circle");
    }

    // Override method to calculate the area of a semicircle
    @Override
    public void calculateArea() {
        double area = 0.5 * Math.PI * radius * radius;
        System.out.println("Area of SemiCircle: " + area);
    }

    // Setter to update radius if needed
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }
}
