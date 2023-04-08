package chapter10queues;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Example02LinkedList
{
    public static void main(String[] args)
    {
        // Create a new LinkedList
        List<String> fruits = new LinkedList<>(); // []

        // Add elements to the LinkedList
        fruits.add("orange"); // [orange]
        fruits.add("banana"); // [orange, banana]
        fruits.add("cherry"); // [orange, banana, cherry]
        fruits.add("date"); // [orange, banana, cherry, date]
        fruits.add("pear"); // [orange, banana, cherry, date, pear]

        // Print out the elements in the LinkedList using foreach
        for (String fruit : fruits)
            System.out.println(fruit); // orange \n banana \n cherry \n date \n pear \n
        System.out.println();

        // Sort the LinkedList
        Collections.sort(fruits); // [banana, cherry, date, orange, pear]

        // Reverse the LinkedList
        Collections.reverse(fruits); // [pear, orange, date, cherry, banana]

        // Get a sublist of the LinkedList
        List<String> subList = fruits.subList(1, 3); // [orange, date]
    }

}
