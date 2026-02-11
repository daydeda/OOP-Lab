package Comparable_Circle_03;

public class TestCircle {
    public static void main(String[] args) {
        ComparableCircle circle1 = new ComparableCircle(5);
        ComparableCircle circle2 = new ComparableCircle(15);

        System.out.println("Circle 1: " + circle1);
        System.out.println("Circle 2: " + circle2);

        int flag = circle1.compareTo(circle2);
        
        switch (flag) {
            case 1:
                System.out.println("The max circle's radius is " + circle1.getRadius());
                break;
            case -1:
                System.out.println("The max circle's radius is " + circle2.getRadius());
                break;
            default:
                System.out.println("Both circles have the same radius.");
                break;
        }
    }
}
