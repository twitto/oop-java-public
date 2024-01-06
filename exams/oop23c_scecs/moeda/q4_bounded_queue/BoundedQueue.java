package exams.oop23c_scecs.moeda.q4_bounded_queue;

public class BoundedQueue<E> implements Queue<E> {
    private E[] elements;
    private int size;
    private final int capacity;

    @SuppressWarnings("unchecked")
    public BoundedQueue(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity must be greater than 0");
        }
        this.capacity = capacity;
        this.elements = (E[]) new Object[capacity];
        size = 0;
    }

    @Override
    public boolean add(E element) {
        if (element == null || size >= capacity) {
            return false;
        }
        elements[size++] = element;
        return true;
    }

    @Override
    public E remove() {
        if (size == 0) {
            return null;
        }
        E element = elements[0];
        for (int i = 0; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[--size] = null;  // Clear the last reference
        return element;
    }
}

