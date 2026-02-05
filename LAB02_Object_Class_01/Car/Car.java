// Puri Sangnawakit 682115036
package LAB02_Object_Class_01.Car;

public class Car {
    // Attributes
    private String color;
    private int speed;
    private int mileage;

    public Car(String col) {
        this.color = col;
        this.speed = 0;
        this.mileage = 0;
    }

    public String getColor() {
        return color;
    }

    public int getSpeed() {
        return speed;
    }

    public int getMileage() {
        return mileage;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setMileage(int ml) {
        this.mileage = ml;
    }
}