
public class Calculator {

    // Addition with two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Addition with two double values
    public double add(double a, double b) {
        return a + b;
    }

    // Addition with three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Subtraction
    public int subtract(int a, int b) {
        return a - b;
    }

    // Multiplication with double
    public double multiply(double a, double b) {
        return a * b;
    }

    // Division (int) with divide-by-zero handling
    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Error: Division by zero");
        }
        return a / b;
    }
}
