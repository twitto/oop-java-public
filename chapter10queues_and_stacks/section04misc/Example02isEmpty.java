package chapter10queues_and_stacks.section04misc;

import java.util.ArrayDeque;
import java.util.Deque;

public class Example02isEmpty
{
    public static void main(String[] args)
    {
        Deque<String> stack = new ArrayDeque<>();

        stack.push("apple");
        stack.push("banana");
        stack.push("cherry");

        while (!stack.isEmpty())
            System.out.println(stack.pop());
    }
}

