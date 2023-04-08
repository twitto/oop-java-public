package chapter10queues;

import java.util.LinkedList;

public class Example01LinkedList {
    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<>(); // []
        fruits.add("apple"); // [apple]
        fruits.add("banana"); // [apple, banana]
        fruits.add("cherry"); // [apple, banana, cherry]

        fruits.addFirst("orange"); // [orange, apple, banana, cherry]
        fruits.addLast("grape"); // [orange, apple, banana, cherry, grape]

        fruits.removeFirst(); // [apple, banana, cherry, grape]
        fruits.removeLast(); // [apple, banana, cherry]

        String firstFruit = fruits.getFirst(); // "apple"
        String lastFruit = fruits.getLast(); // "cherry"

        boolean containsCherry = fruits.contains("cherry"); // true

        int size = fruits.size(); // 3
    }

}

