package solidprinciples.lsp;

/*

The Liskov Substitution Principle (LSP) is one of the SOLID principles in object-oriented programming.
It states that objects of a superclass should be replaceable with objects of a subclass without affecting the correctness of the program.
In other words, if a program is using a base class, it should be able to use any of its derived classes without knowing it.

In this example, Circle and Square are subclasses of the Shape class.
The LSPExample class demonstrates that objects of the Circle and Square classes can be used interchangeably where a Shape is expected
 (e.g., in the drawShape method) without affecting the correctness of the program.

By adhering to the Liskov Substitution Principle, you can create a more flexible and extensible design where new subclasses can be added
without breaking existing code that relies on the base class.
 */
class Shape {
    public int area() {
        return 0;
    }
}

class Circle extends Shape {
    int r;

    // Constructor to initialize 'r'
    public Circle(int radius) {
        this.r = radius;
    }

    @Override
    public int area() {
        return (int) (Math.PI * r * r);
    }
}

class Square extends Shape {
    int base;

    // Constructor to initialize 'base'
    public Square(int side) {
        this.base = side;
    }

    @Override
    public int area() {
        return base * base;
    }
}

public class LSPExample {
    public static void main(String[] args) {
        // Initialize 'r' for Circle and 'base' for Square
        Shape circle = new Circle(5);
        Shape square = new Square(4);

        // Both objects can be used interchangeably
        System.out.println(drawShape(circle));
        System.out.println(drawShape(square));
    }

    public static int drawShape(Shape shape) {
        return shape.area();
    }
}
