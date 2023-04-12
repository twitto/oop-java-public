package chapter10queues_and_stacks.section02deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class Example01ArrayDequeAsDeque
{
    public static void main(String[] args)
    {
        Deque<String> deque = new ArrayDeque<>(); // []

        deque.addFirst("apple"); // [apple]
        deque.addLast("banana"); // [apple, banana]
        deque.addFirst("cherry"); // [cherry, apple, banana]

        String first = deque.getFirst(); // "cherry", [cherry, apple, banana]
        String last = deque.getLast(); // "banana", [cherry, apple, banana]

        deque.removeFirst(); // [apple, banana]
        deque.removeLast(); // [apple]
    }
}
