package chapter07exceptions.examples.example1scanner;

import java.util.Scanner;

public class Example1Scanner
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        try {
            int result = factorial(num);
            System.out.println(num + "! = " + result);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static int factorial(int n) throws Exception
    {
        if (n < 0) throw new Exception("Number must be non-negative!");
        if (n == 0) return 1;
        else return n * factorial(n - 1);
    }
}
