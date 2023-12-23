package solidprinciples.ocp;

// Shape interface
interface Shape {
    double calculateArea();
}

// Rectangle class implementing Shape
class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}

// Circle class implementing Shape
class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// AreaCalculator class adhering to OCP
class AreaCalculator {
    public double calculateArea(Shape shape) {
        return shape.calculateArea();
    }
}

// Client code
public class OCPExample {
    public static void main(String[] args) {

        Shape rectangle = new Rectangle(5, 10);
        Shape circle = new Circle(7);

        AreaCalculator areaCalculator = new AreaCalculator();

        System.out.println("Rectangle Area: " + areaCalculator.calculateArea(rectangle));
        System.out.println("Circle Area: " + areaCalculator.calculateArea(circle));

    }
}
