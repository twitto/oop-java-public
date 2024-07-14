package chapter05generics.example03arrayutilities;

public class Main
{
    public static void main(String[] args)
    {
        Integer[] a = {1, 2, 3};
        Integer[] b = a;
        ArrayUtilities.print(b);

        System.out.println(ArrayUtilities.randomElement(b));
        System.out.println(ArrayUtilities.randomElement(b));

        System.out.println(ArrayUtilities.sum(b));
    }
}
