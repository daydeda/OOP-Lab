package Geometric_01;

public class Color {
    public static void main(String[] args) {
        // Create an array of five GeometricObjects
        GeometricObject[] objects = {
                new Square(2),
                new Square(3),
                new Square(4.5),
                new Square(5),
                new Square(6)
        };

        // Iterate through the array
        for (int i = 0; i < objects.length; i++) {
            System.out.println("Area is " + objects[i].getArea());

            // Check if the object implements Colorable
            if (objects[i] instanceof Colorable) {
                ((Colorable) objects[i]).howToColor();
            }
        }
    }
}

// 1. The Colorable Interface
interface Colorable {
    /** Describe how to color */
    void howToColor();
}

// 3. The Square Class
class Square extends GeometricObject implements Colorable {
    private double side;

    /** No-arg constructor */
    public Square() {
        this.side = 0;
    }

    /** Constructor with specified side */
    public Square(double side) {
        this.side = side;
    }

    /** Getter for side */
    public double getSide() {
        return side;
    }

    /** Setter for side */
    public void setSide(double side) {
        this.side = side;
    }

    @Override // Implement abstract method from GeometricObject
    public double getArea() {
        return side * side;
    }

    @Override // Implement abstract method from GeometricObject
    public double getPerimeter() {
        return 4 * side;
    }

    @Override // Implement method from Colorable interface
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}