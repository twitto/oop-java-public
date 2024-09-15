package exams.oop24b_scecs.moeda.q4_bounded_stack;

import java.util.NoSuchElementException;

public class BoundedStack<T> implements Stack<T> {
    private T[] stack;
    private int top;
    private int capacity;

    @SuppressWarnings("unchecked")
    public BoundedStack(int capacity) {
        this.capacity = capacity;
        this.stack = (T[]) new Object[capacity];
        this.top = -1;
    }

    @Override
    public void push(T element) throws StackOverflowError {
        if (isFull()) {
            throw new StackOverflowError("Stack is full.");
        }
        stack[++top] = element;
    }

    @Override
    public T pop() throws NoSuchElementException {
        if (isEmpty()) {
            throw new NoSuchElementException("Stack is empty.");
        }
        T element = stack[top];
        stack[top--] = null;  // Clear the reference for garbage collection.
        return element;
    }

    @Override
    public T peek() throws NoSuchElementException {
        if (isEmpty()) {
            throw new NoSuchElementException("Stack is empty.");
        }
        return stack[top];
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public boolean isFull() {
        return top == capacity - 1;
    }

    @Override
    public void filter(T element) {
        int currentIndex = 0;
        for (int i = 0; i <= top; i++) {
            if (!stack[i].equals(element)) {
                stack[currentIndex++] = stack[i];
            }
        }
        // Set the rest of the array to null
        while (currentIndex <= top) {
            stack[currentIndex++] = null;
        }
        top = currentIndex - 1;
    }
}
