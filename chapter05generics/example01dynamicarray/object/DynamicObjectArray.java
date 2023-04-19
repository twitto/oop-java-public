package chapter05generics.example01dynamicarray.object;

public interface DynamicObjectArray
{

    // Add a new element to the end of the array
    void add(Object element);

    // Retrieve the element at the given index
    Object get(int index);

    // Set the element at the given index to the new value
    void set(int index, Object value);

    // Remove the element at the given index
    void remove(int index);

    // Return the number of elements in the array
    int size();

    // Check if the array is empty
    boolean isEmpty();
}
