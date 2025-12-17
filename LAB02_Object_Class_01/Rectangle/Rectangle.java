// Puri Sangnawakit 682115036
package LAB02_Object_Class_01.Rectangle;

public class Rectangle {
    private double height;
    private double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public void setHeight(int height) {
        this.height = height; 
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void calArea(double height, double width) {
        double area = getWidth() * getHeight();
        System.out.println(area);
    }

    public void calPerimeter(double height, double width) {
        double perimeter = 2 * (getWidth() + getHeight());
        System.out.println(perimeter);
    }
}
