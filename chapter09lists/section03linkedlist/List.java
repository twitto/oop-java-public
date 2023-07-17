package chapter09lists.section03linkedlist;

public interface List<T>
{
    boolean isEmpty();

    int size();

    void add(T data);

    void remove(T data);
}