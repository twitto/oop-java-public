package chapter09lists.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Example03ArrayListIterate {
    public static void main(String[] args) {
        // Create an ArrayList of strings
        List<String> fruits = new ArrayList<String>();
        // Add elements to the ArrayList
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");
        fruits.add("orange");
        fruits.add("fig");
        // Iterate over the elements of the ArrayList using foreach
        System.out.println("Iterating over the elements of the ArrayList using foreach:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
    //Iterating over the elements of the ArrayList using foreach:
    //apple
    //banana
    //cherry
    //orange
    //fig
}
