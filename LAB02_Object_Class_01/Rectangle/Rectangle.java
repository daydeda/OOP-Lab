// Puri Sangnawakit 682115036
package LAB02_Object_Class_01.Rectangle;

public class Rectangle {
    private float height;
    private float width;

    public Rectangle(float height, float width) {
        this.height = height;
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public float getWidth() {
        return width;
    }

    public void setHeight(int height) {
        this.height = height; 
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void calArea(float height, float width) {
        float area = getWidth() * getHeight();
        System.out.println(area);
    }

    public void calPerimeter(float height, float width) {
        double perimeter = 2 * (getWidth() + getHeight());
        System.out.println(perimeter);
    }
}
