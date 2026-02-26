public class TestTriangle {
    public static void main(String[] args) {
        try {
            Triangle t1 = new Triangle(1.5, 2.0, 3.0);
            System.out.println("Perimeter for t1: " + t1.getPerimeter());
            System.out.println("Area for t1: " + t1.getArea());

            Triangle t2 = new Triangle(1.0, 2.0, 3.0);
            System.out.println("Perimeter for t2: " + t2.getPerimeter());
            System.out.println("Area for t2: " + t2.getArea());
        } catch (IllegalTriangleException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Side1: " + ex.getSide1());
            System.out.println("Side2: " + ex.getSide2());
            System.out.println("Side3: " + ex.getSide3());
        }
    }
}
