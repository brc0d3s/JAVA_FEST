package OOP.Abstraction;

// Interface
interface Shape {
    // Abstract method to calculate area (to be implemented by classes)
    double calculateArea();

    // Another abstract method (can be implemented by classes if needed)
    void displayInfo();
}

// Class implementing the Shape interface
class Circle implements Shape {
    // Fields
    private double radius;

    // Constructor
    Circle(double radius) {
        this.radius = radius;
    }

    // Implementation of the calculateArea method
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Implementation of the displayInfo method
    public void displayInfo() {
        System.out.println("This is a circle.");
    }
}

// Class implementing the Shape interface
class Rectangle implements Shape {
    // Fields
    private double length;
    private double width;

    // Constructor
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implementation of the calculateArea method
    public double calculateArea() {
        return length * width;
    }

    // Implementation of the displayInfo method
    public void displayInfo() {
        System.out.println("This is a rectangle.");
    }
}

// Main class
public class Interface {
    public static void main(String[] args) {
        // Creating objects of classes implementing the Shape interface
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(4.0, 6.0);

        // Calling interface methods
        circle.displayInfo();
        System.out.println("Area of circle: " + circle.calculateArea());

        rectangle.displayInfo();
        System.out.println("Area of rectangle: " + rectangle.calculateArea());
    }
}
