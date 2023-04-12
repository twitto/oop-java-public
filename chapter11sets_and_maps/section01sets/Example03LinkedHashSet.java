package chapter11sets_and_maps.section01sets;

import java.util.LinkedHashSet;
import java.util.Set;

public class Example03LinkedHashSet
{
    public static void main(String[] args)
    {
        Set<String> fruits = new LinkedHashSet<>(); // []
        fruits.add("pear");
        fruits.add("banana");
        fruits.add("orange");
        fruits.add("apple");
        System.out.println(fruits); // [pear, banana, orange, apple]

        System.out.println(fruits.contains("apple")); // true

        fruits.remove("banana");

        for (String element : fruits)
            System.out.println(element); // pear \n orange \n apple

        fruits.clear(); // []
    }
}
