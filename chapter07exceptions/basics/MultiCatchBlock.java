package chapter07exceptions.basics;

class MultiCatchBlock
{
    public static void main(String[] args)
    {
        try {
            int array[] = new int[10];
            array[10] = 30 / 0;
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
// Exception: / by zero