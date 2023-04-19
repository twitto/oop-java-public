package chapter05generics.example03arrayutilities;

import java.util.Random;

public class ArrayUtilities
{
    public static <T> void print(T[] array)
    {
        for (T element : array) {
            System.out.println(element);
        }
    }

    public static <T> void swap(T[] array, int i, int j)
    {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static <T> T randomElement(T[] array)
    {
        Random random = new Random();
        int index = random.nextInt(array.length);
        return array[index];
    }

    public static <T> T[] copy(T[] source)
    {
        T[] destination = (T[]) new Object[source.length];
        for (int i = 0; i < source.length; i++) {
            destination[i] = source[i];
        }
        return destination;
    }

    private static <T extends Number> double sum(T[] array)
    {
        double sum = 0;
        for (T t : array) {
            sum += t.doubleValue();
        }
        return sum;
    }
}