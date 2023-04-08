package chapter09lists.linkedlist;

import java.util.LinkedList;
import java.util.List;

public class Example01LinkedList {
    public static void main(String[] args)
    {
        List<String> colors = new LinkedList<>();

        colors.add("red"); // ["red"]
        colors.add("green"); // ["red", "green"]
        colors.add("blue"); // ["red", "green", "blue"]

        // get an element at index
        String secondColor = colors.get(1); // green

        // replace an element at index
        colors.set(0, "orange"); // [orange, green, blue]

        // remove an element at index
        String removedColor = colors.remove(2); // [orange, green]

        // check if an element exists
        boolean containsRed = colors.contains("red"); // false

        // check the index of an element
        int indexOfGreen = colors.indexOf("green"); // 1

        // check the size of the list
        int size = colors.size(); // 2

        // clear the list
        colors.clear(); // []
    }
}

