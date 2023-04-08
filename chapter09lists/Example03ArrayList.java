package chapter09lists;

import java.util.ArrayList;

public class Example03ArrayList {
    public static void main(String[] args) {

        // Create an ArrayList of strings
        ArrayList<String> fruits = new ArrayList<String>();

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
}
