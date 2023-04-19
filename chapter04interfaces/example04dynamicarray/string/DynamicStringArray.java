package chapter04interfaces.example04dynamicarray.string;

public interface DynamicStringArray
{

    // Add a new element to the end of the array
    void add(String element);

    // Retrieve the element at the given index
    String get(int index);

    // Set the element at the given index to the new value
    void set(int index, String value);

    // Remove the element at the given index
    void remove(int index);

    // Return the number of elements in the array
    int size();

    // Check if the array is empty
    boolean isEmpty();
}

