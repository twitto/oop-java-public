package chapter09lists.section01arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Example04ArrayListSort
{
    public static void main(String[] args)
    {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(1);
        numbers.add(3);
        numbers.add(2);
        Collections.sort(numbers);
        System.out.println(numbers); //[1, 2, 3, 5]
    }

}
