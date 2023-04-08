package chapter07exceptions.examples.example3calculator;

import java.util.Scanner;

public class CalculatorApp
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to the calculator program!");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Enter first number: ");
                double num1 = scanner.nextDouble();
                System.out.print("Enter second number: ");
                double num2 = scanner.nextDouble();
                System.out.println("Select operation: +, -, *, /");
                String operation = scanner.next();
                double result = Calculator.calculate(num1, num2, operation);
                System.out.println("Result: " + result);
                System.out.println("Do you want to perform another calculation? (y/n)");
                String input = scanner.next();
                if (input.equalsIgnoreCase("n"))
                    break;
            } catch (Exception e) {
                System.out.println("Exception occurred: " + e.getMessage());
                System.out.println("Do you want to try again? (y/n)");
                String input = scanner.next();
                if (input.equalsIgnoreCase("n"))
                    break;
            }
        }
        scanner.close();
        System.out.println("Thank you for using the calculator program!");
    }
}