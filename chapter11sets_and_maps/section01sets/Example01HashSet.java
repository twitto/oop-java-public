package chapter11sets_and_maps.section01sets;

import java.util.HashSet;
import java.util.Set;

public class Example01HashSet
{
    public static void main(String[] args)
    {
        Set<String> fruits = new HashSet<>(); // []
        fruits.add("pear");
        fruits.add("banana");
        fruits.add("orange");
        fruits.add("apple");
        System.out.println(fruits); // [banana, orange, apple, pear]

        System.out.println(fruits.contains("apple")); // true

        fruits.remove("banana");

        for (String element : fruits)
            System.out.println(element); // orange \n apple \n pear

        fruits.clear(); // []
    }
}
