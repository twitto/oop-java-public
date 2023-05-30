package chapter05generics.example03arrayutilities;

import javax.sound.midi.Soundbank;
import java.math.BigDecimal;
import java.sql.SQLOutput;

public class Main
{
    public static void main(String[] args)
    {
        Integer[] a = {1, 2, 3};
        Integer[] b = ArrayUtilities.copy(a, Integer.class);
        ArrayUtilities.print(b);

        System.out.println(ArrayUtilities.randomElement(b));
        System.out.println(ArrayUtilities.randomElement(b));

        System.out.println(ArrayUtilities.sum(b));
    }
}
