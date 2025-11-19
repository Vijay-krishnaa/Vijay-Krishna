class Calculator {
  public double calculate(double a, double b, char op) {
    switch (op) {
      case '+':
        return a + b;
      case '-':
        return a - b;
      case '*':
        return a * b;
      case '/':
        if (b == 0)
          throw new ArithmeticException("Cannot divide by zero");
        return a / b;
      default:
        throw new IllegalArgumentException("Invalid operator");
    }
  }
}

public class Problem1 {
  public static void main(String[] args) {
    Calculator c = new Calculator();

    System.out.println(c.calculate(5, 3, '+'));
    System.out.println(c.calculate(10, 4, '-'));
    System.out.println(c.calculate(6, 7, '*'));
    System.out.println(c.calculate(15, 3, '/'));
  }
}
