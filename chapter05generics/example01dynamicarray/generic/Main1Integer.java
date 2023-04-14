package chapter05generics.example01dynamicarray.generic;

public class Main1Integer
{
    public static void main(String[] args) {
        DynamicArray<Integer> array = new SimpleDynamicArray<>(); // create a new instance of SimpleDynamicArray

        // add some integers to the array
        array.add(1);
        array.add(2);
        array.add(3);

        // get an integer from the array and print it
        int num = array.get(1); // get the integer at index 1 (which should be 2)
        System.out.println("Integer at index 1: " + num);

        // set an integer in the array to a new value
        array.set(2, 4); // set the integer at index 2 to 4

        // remove an integer from the array
        array.remove(0); // remove the integer at index 0 (which should be 1)

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
