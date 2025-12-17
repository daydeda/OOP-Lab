// Puri Sangnawakit 682115036
package LAB02_Object_Class_01.Rectangle;

public class MyRectangle {
    public static void main(String[] args) {
        Rectangle Square = new Rectangle(5.0, 5.0);
        System.out.println("Square " + Square.getHeight()+ " x " + Square.getWidth());
        System.out.print("Area: ");
        Square.calArea(0, 0);
        System.out.print("Perimeter: ");
        Square.calPerimeter(0, 0);

        System.out.println();

        Rectangle Non_Square = new Rectangle(8.0, 5.0);
        System.out.println("Non_Square " + Non_Square.getHeight()+ " x " + Non_Square.getWidth());
        System.out.print("Area: ");
        Square.calArea(0, 0);
        System.out.print("Perimeter: ");
        Square.calPerimeter(0, 0);
    }
}
