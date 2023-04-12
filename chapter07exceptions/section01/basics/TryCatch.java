package chapter07exceptions.section01.basics;

class TryCatch
{
    public static void main(String[] args)
    {
        try {
            // code that generate exception
            int divideByZero = 5 / 0;
            System.out.println("Rest of code in try block");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException => " + e.getMessage());
        }
    }
}

