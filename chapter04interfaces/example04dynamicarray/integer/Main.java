package chapter04interfaces.example04dynamicarray.integer;

public class Main
{
    public static void main(String[] args)
    {
        DynamicIntegerArray array = new SimpleDynamicIntegerArray(); // create a new instance of SimpleDynamicArray

        // add some elements to the array
        array.add(5);
        array.add(10);
        array.add(15);

        // get an element from the array and print it
        int element = array.get(1); // get the element at index 1 (which should be 10)
        System.out.println("Element at index 1: " + element);

        // set an element in the array to a new value
        array.set(2, 20); // set the element at index 2 to 20

        // remove an element from the array
        array.remove(0); // remove the element at index 0 (which should be 5)

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
