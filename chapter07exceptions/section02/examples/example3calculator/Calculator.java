package chapter07exceptions.section02.examples.example3calculator;

class Calculator
{
    public static double calculate(double num1, double num2, String operation) throws IllegalArgumentException, ArithmeticException
    {
        switch (operation) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                if (num2 == 0) {
                    throw new ArithmeticException("Division by zero is not allowed");
                }
                return num1 / num2;
            default:
                throw new IllegalArgumentException("Invalid operation: " + operation);
        }
    }
}
