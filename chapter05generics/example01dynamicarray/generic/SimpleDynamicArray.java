package chapter05generics.example01dynamicarray.generic;

import java.util.Arrays;
public class SimpleDynamicArray<E> implements DynamicArray<E> {

    private E[] elements;
    private int size;

    public SimpleDynamicArray() {
        this.elements = (E[]) new Object[10];
        this.size = 0;
    }

    @Override
    public void add(E element) {
        if (size == elements.length) {
            elements = Arrays.copyOf(elements, elements.length * 2);
        }
        elements[size++] = element;
    }

    @Override
    public E get(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();
        return elements[index];
    }

    @Override
    public void set(int index, E value) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();
        elements[index] = value;
    }

    @Override
    public void remove(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();
        for (int i = index; i < size - 1; i++)
            elements[i] = elements[i + 1];
        size--;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }
}
