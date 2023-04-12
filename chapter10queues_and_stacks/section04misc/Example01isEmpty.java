package chapter10queues_and_stacks.section04misc;

import java.util.ArrayDeque;
import java.util.Queue;

public class Example01isEmpty
{
    public static void main(String[] args)
    {
        Queue<String> queue = new ArrayDeque<>();

        queue.add("apple");
        queue.add("banana");
        queue.add("cherry");

        while (!queue.isEmpty())
            System.out.println(queue.remove());
    }
}

