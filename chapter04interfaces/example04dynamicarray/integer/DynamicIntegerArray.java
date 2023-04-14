package chapter04interfaces.example04dynamicarray.integer;

public interface DynamicIntegerArray {

    // Add a new element to the end of the array
    void add(int element);

    // Retrieve the element at the given index
    int get(int index);

    // Set the element at the given index to the new value
    void set(int index, int value);

    // Remove the element at the given index
    void remove(int index);

    // Return the number of elements in the array
    int size();

    // Check if the array is empty
    boolean isEmpty();
}

