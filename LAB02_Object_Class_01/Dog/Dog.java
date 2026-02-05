// Puri Sangnawakit 682115036
package LAB02_Object_Class_01.Dog;

public class Dog {
    private String color;
    private double weight;

    public Dog(String col, double weight) {
        this.color = col;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public double getWeight() {
        return weight;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
