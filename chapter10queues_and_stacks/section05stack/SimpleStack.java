package chapter10queues_and_stacks.section05stack;

public class SimpleStack<T> implements Stack<T>
{
    private static final int DEFAULT_CAPACITY = 10;
    private T[] stack;
    private int top;

    public SimpleStack()
    {
        stack = (T[]) new Object[DEFAULT_CAPACITY];
        top = -1;
    }

    @Override
    public void push(T item)
    {
        if (top == stack.length - 1) {
            expandCapacity();
        }
        stack[++top] = item;
    }

    @Override
    public T pop()
    {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        T item = stack[top];
        stack[top--] = null;
        return item;
    }

    @Override
    public T peek()
    {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stack[top];
    }

    @Override
    public boolean isEmpty()
    {
        return top == -1;
    }

    @Override
    public int size()
    {
        return top + 1;
    }

    private void expandCapacity()
    {
        T[] newStack = (T[]) new Object[stack.length * 2];
        System.arraycopy(stack, 0, newStack, 0, stack.length);
        stack = newStack;
    }
}
