package chapter05generics.example01dynamicarray.generic;

public class Main3Object
{
    public static void main(String[] args)
    {
        DynamicArray<Object> array = new SimpleDynamicArray<>(); // create a new instance of SimpleDynamicArray

        // add some objects to the array
        array.add("Hello");
        array.add(42);
        array.add(true);

        // get an object from the array and print it
        Object obj = array.get(1); // get the object at index 1 (which should be 42)
        System.out.println("Object at index 1: " + obj);

        // set an object in the array to a new value
        array.set(2, "World"); // set the object at index 2 to "World"

        // remove an object from the array
        array.remove(0); // remove the object at index 0 (which should be "Hello")

        // print the size and contents of the array
        System.out.println("Size of array: " + array.size()); // should be 2
        System.out.println("Array contents: ");
        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));
        }

        // check if the array is empty
        System.out.println("Array is empty? " + array.isEmpty()); // should be false
    }

}
