package OOP.Abstraction;

// Abstract class
abstract class Shape {
    // Abstract method (to be implemented by subclasses)
    abstract double calculateArea();

    // Concrete method
    void display() {
        System.out.println("This is a shape.");
    }
}

// Concrete subclass 1
class Circle extends Shape {
    // Fields
    private double radius;

    // Constructor
    Circle(double radius) {
        this.radius = radius;
    }

    // Implementation of the abstract method
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Concrete subclass 2
class Rectangle extends Shape {
    // Fields
    private double length;
    private double width;

    // Constructor
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implementation of the abstract method
    double calculateArea() {
        return length * width;
    }
}

// Main class
public class Abstract_Class {
    public static void main(String[] args) {
        // Creating objects of concrete subclasses
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(4.0, 6.0);

        // Calling abstract and concrete methods
        circle.display();
        System.out.println("Area of circle: " + circle.calculateArea());

        rectangle.display();
        System.out.println("Area of rectangle: " + rectangle.calculateArea());
    }
}

