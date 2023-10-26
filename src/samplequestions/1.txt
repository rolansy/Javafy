// Abstract class Shape
abstract class Shape {
    // Abstract method to get the number of sides
    public abstract int getNumberOfSides();
    
    // Concrete method
    public void display() {
        System.out.println("This is a shape.");
    }
}

// Concrete class Triangle
class Triangle extends Shape {
    @Override
    public int getNumberOfSides() {
        return 3;
    }
}

// Concrete class Rectangle
class Rectangle extends Shape {
    @Override
    public int getNumberOfSides() {
        return 4;
    }
}

// Concrete class Hexagon
class Hexagon extends Shape {
    @Override
    public int getNumberOfSides() {
        return 6;
    }
}

public class ShapeAbstractionTrial {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        Rectangle rectangle = new Rectangle();
        Hexagon hexagon = new Hexagon();

        System.out.println("Triangle has " + triangle.getNumberOfSides() + " sides.");
        System.out.println("Rectangle has " + rectangle.getNumberOfSides() + " sides.");
        System.out.println("Hexagon has " + hexagon.getNumberOfSides() + " sides.");
    }
}
