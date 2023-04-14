package chapter04interfaces.example04dynamicarray.string;

import java.util.Arrays;

public class SimpleDynamicStringArray implements DynamicStringArray
{

    private String[] elements;
    private int size;

    public SimpleDynamicStringArray()
    {
        this.elements = new String[10];
        this.size = 0;
    }

    @Override
    public void add(String element)
    {
        if (size == elements.length) {
            elements = Arrays.copyOf(elements, elements.length * 2);
        }
        elements[size++] = element;
    }

    @Override
    public String get(int index)
    {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();
        return elements[index];
    }

    @Override
    public void set(int index, String value)
    {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();
        elements[index] = value;
    }

    @Override
    public void remove(int index)
    {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();
        for (int i = index; i < size - 1; i++)
            elements[i] = elements[i + 1];
        size--;
    }

    @Override
    public int size()
    {
        return size;
    }

    @Override
    public boolean isEmpty()
    {
        return size == 0;
    }
}
