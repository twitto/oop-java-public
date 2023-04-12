package chapter10queues_and_stacks.section01queue;

import java.util.LinkedList;
import java.util.Queue;

public class Example02LinkedListAsQueue
{
    public static void main(String[] args)
    {
        Queue<String> queue = new LinkedList<>(); // []

        queue.add("apple"); // [apple]
        queue.add("banana"); // [apple, banana]
        queue.add("cherry"); // [apple, banana, cherry]

        String removedElement = queue.remove(); // "apple", [banana, cherry]

        String firstElement = queue.element(); // "banana", [banana, cherry]
    }
}
