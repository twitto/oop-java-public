package chapter10queues_and_stacks.section02deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class Example03ArrayDequeAsDequeInitialCapacity
{
    public static void main(String[] args)
    {
        Deque<String> deque = new ArrayDeque<>(2);

        for (int i = 0; i < 50; i++) {
            deque.addFirst("apple");
            deque.addLast("banana");
            deque.addFirst("cherry");
        }
        System.out.println(deque);
    }
}
