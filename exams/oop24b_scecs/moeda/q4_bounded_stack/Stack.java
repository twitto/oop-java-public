package exams.oop24b_scecs.moeda.q4_bounded_stack;

import java.util.NoSuchElementException;

/**
 * Interface for a stack data structure, operating on a
 * "Last In, First Out" (LIFO) principle.
 *
 * @param <T> The type of elements in the stack.
 */
public interface Stack<T> {
    /**
     * Pushes an element onto the stack.
     * @param element The element to be added.
     * @throws StackOverflowError if the stack is full.
     */
    void push(T element) throws StackOverflowError;

    /**
     * Removes and returns the top element of the stack.
     * @return The top element.
     * @throws NoSuchElementException if the stack is empty.
     */
    T pop() throws NoSuchElementException;

    /**
     * Returns the top element without removing it.
     * @return The top element.
     * @throws NoSuchElementException if the stack is empty.
     */
    T peek() throws NoSuchElementException;

    /**
     * Checks if the stack is empty.
     * @return {@code true} if the stack is empty, otherwise {@code false}.
     */
    boolean isEmpty();

    /**
     * Checks if the stack is full.
     * @return {@code true} if the stack is full, otherwise {@code false}.
     */
    boolean isFull();

    /**
     * Removes all elements equal to the specified element.
     * @param element The element to be removed.
     */
    void filter(T element);
}

