package demo;

public class MathOperations {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) throw new java.lang.IllegalArgumentException("Divider cannot be zero");
        return a / b;
    }

    public int power(int a, int b) {
        return (int) Math.pow(a, b);
    }

    public boolean isPositive(int x) {
        return x > 0;
    }
}
