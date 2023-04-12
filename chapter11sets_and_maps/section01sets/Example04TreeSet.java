package chapter11sets_and_maps.section01sets;

import java.util.Set;
import java.util.TreeSet;

public class Example04TreeSet
{
    public static void main(String[] args)
    {
        Set<String> fruits = new TreeSet<>(); // []
        fruits.add("pear");
        fruits.add("banana");
        fruits.add("orange");
        fruits.add("apple");
        System.out.println(fruits); // [apple, banana, orange, pear]

        System.out.println(fruits.contains("apple")); // true

        fruits.remove("banana");

        for (String element : fruits)
            System.out.println(element); // apple \n orange \n pear

        fruits.clear(); // []
    }
}
