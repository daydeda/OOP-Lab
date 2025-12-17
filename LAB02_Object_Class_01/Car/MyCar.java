// Puri Sangnawakit 682115036
package LAB02_Object_Class_01.Car;

public class MyCar {
    public static void main(String[] args) {
        Car Toyota = new Car("red");
        Toyota.setSpeed(200);
        Toyota.setMileage(1345);
        System.out.println(
                "Toyota color: " + Toyota.getColor() + " speed: " + Toyota.getSpeed() + " Mileage: " + Toyota.getMileage());

        Car Honda = new Car("blue");
        Honda.setSpeed(300);
        Honda.setMileage(8987);
        System.out.println(
                "Honda color: " + Honda.getColor() + " speed: " + Honda.getSpeed() + " Mileage: " + Honda.getMileage());
    }
}
