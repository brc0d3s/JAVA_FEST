package OOP.Abstraction;

// Interface for the first behavior
interface Shape {
    double calculateArea();
}

// Interface for the second behavior
interface Color {
    String getColor();
}

// Class implementing both interfaces, achieving multiple inheritance
class ColoredCircle implements Shape, Color {
    // Fields
    private double radius;
    private String color;

    // Constructor
    ColoredCircle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    // Implementation of the calculateArea method from the Shape interface
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Implementation of the getColor method from the Color interface
    public String getColor() {
        return color;
    }
}

// Main class
public class Multiple_Inheritance_by_Interface {
    public static void main(String[] args) {
        // Creating an object of the class implementing multiple interfaces
        ColoredCircle coloredCircle = new ColoredCircle(5.0, "Red");

        // Calling methods from both interfaces
        System.out.println("Area of colored circle: " + coloredCircle.calculateArea());
        System.out.println("Color of the circle: " + coloredCircle.getColor());
    }
}
