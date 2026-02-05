package Calculator;

public class Calculator {
    // Add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Add two doubles
    public double add(double a, double b) {
        return a + b;
    }

    // Add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Add all integers in an array
    public int add(int[] numbers) {
        int sum = 0;
        for (int n : numbers) sum += n;
        return sum;
    }
}

