package chapter09lists.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Example02ArrayListSet {
    public static void main(String[] args) {
        // Create an ArrayList of strings
        List<String> fruits = new ArrayList<String>();
        // Add elements to the ArrayList
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");
        fruits.add("orange");
        fruits.add("fig");
        // Update an element in the ArrayList
        fruits.set(1, "blueberry");
        System.out.println("Updated ArrayList after setting element at index 1 to blueberry: " + fruits);
        // Remove an element from the ArrayList
        fruits.remove(2);
        System.out.println("Updated ArrayList after removing element at index 2: " + fruits);
        // Check if the ArrayList contains an element
        boolean containsBanana = fruits.contains("banana");
        System.out.println("Does the ArrayList contain the element banana? " + containsBanana);
        // Clear the ArrayList
        fruits.clear();
        System.out.println("Updated ArrayList after clearing all elements: " + fruits);
    }
    //Updated ArrayList after setting element at index 1 to blueberry: [apple, blueberry, cherry, orange, fig]
    //Updated ArrayList after removing element at index 2: [apple, blueberry, orange, fig]
    //Does the ArrayList contain the element banana? false
    //Updated ArrayList after clearing all elements: []
}
