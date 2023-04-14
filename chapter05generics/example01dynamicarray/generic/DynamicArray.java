package chapter05generics.example01dynamicarray.generic;
public interface DynamicArray<E> {

    // Add a new element to the end of the array
    void add(E element);

    // Retrieve the element at the given index
    E get(int index);

    // Set the element at the given index to the new value
    void set(int index, E value);

    // Remove the element at the given index
    void remove(int index);

    // Return the number of elements in the array
    int size();

    // Check if the array is empty
    boolean isEmpty();
}
