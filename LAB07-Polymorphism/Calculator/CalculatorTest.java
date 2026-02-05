package Calculator;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Add two integers: " + calc.add(5, 3));
        System.out.println("Add two doubles: " + calc.add(5.5, 3.2));
        System.out.println("Add three integers: " + calc.add(1, 2, 3));
        System.out.println("Add an array: " + calc.add(new int[] { 1, 2, 3, 4, 5 }));
    }
}
