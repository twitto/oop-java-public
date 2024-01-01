package exams.oop23b_scecs.oop23b_scecs_examsample2_only_code.q4_stack;


import java.util.Arrays;

public class ArrayStack<T> implements StackInterface<T>
{
    private static final int DEFAULT_CAPACITY = 10;
    private T[] array;
    private int top;

    @SuppressWarnings("unchecked")
    public ArrayStack() {
        array = (T[]) new Object[DEFAULT_CAPACITY];
        top = -1;
    }

    public void push(T element) {
        if (top == array.length - 1) {
            expandCapacity();
        }
        array[++top] = element;
    }

    public T pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack underflow: Cannot pop from an empty stack");
        }
        return array[top--];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    private void expandCapacity() {
        int newSize = array.length * 2;
        array = Arrays.copyOf(array, newSize);
    }
}

