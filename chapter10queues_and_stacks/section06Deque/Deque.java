package chapter10queues_and_stacks.section06Deque;

import java.util.NoSuchElementException;

// Interface defining the Deque operations
public interface Deque<T>
{
    void addFirst(T element);   // Add an element to the front
    void addLast(T element);    // Add an element to the back

    T removeFirst();            // Remove an element from the front
    T removeLast();             // Remove an element from the back

    T getFirst();               // Get the element at the front
    T getLast();                // Get the element at the back

    boolean isEmpty();          // Check if the deque is empty
    int size();                 // Get the number of elements in the deque
}

