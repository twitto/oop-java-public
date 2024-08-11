package chapter10queues_and_stacks.section06Deque;

import java.util.NoSuchElementException;

// Implementation of ArrayDeque
public class ArrayDeque<T> implements Deque<T>
{
    private T[] deque;
    private int front;
    private int back;
    private int size;
    private int capacity;

    // Constructor
    public ArrayDeque(int capacity) {
        this.capacity = capacity;
        this.deque = (T[]) new Object[capacity];
        this.front = 0;
        this.back = 0;
        this.size = 0;
    }

    @Override
    public void addFirst(T element) {
        if (size == capacity) {
            throw new IllegalStateException("Deque is full");
        }
        front = (front - 1 + capacity) % capacity;
        deque[front] = element;
        size++;
    }

    @Override
    public void addLast(T element) {
        if (size == capacity) {
            throw new IllegalStateException("Deque is full");
        }
        deque[back] = element;
        back = (back + 1) % capacity;
        size++;
    }

    @Override
    public T removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("Deque is empty");
        }
        T element = deque[front];
        deque[front] = null;
        front = (front + 1) % capacity;
        size--;
        return element;
    }

    @Override
    public T removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("Deque is empty");
        }
        back = (back - 1 + capacity) % capacity;
        T element = deque[back];
        deque[back] = null;
        size--;
        return element;
    }

    @Override
    public T getFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("Deque is empty");
        }
        return deque[front];
    }

    @Override
    public T getLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("Deque is empty");
        }
        int lastIndex = (back - 1 + capacity) % capacity;
        return deque[lastIndex];
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

}
