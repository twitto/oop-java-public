package chapter05generics.example01dynamicarray.generic;

public class Main2String
{
    public static void main(String[] args) {
        DynamicArray<String> array = new SimpleDynamicArray<>(); // create a new instance of SimpleDynamicArray

        // add some strings to the array
        array.add("Hello");
        array.add("world");
        array.add("!");

        // get a string from the array and print it
        String str = array.get(1); // get the string at index 1 (which should be "world")
        System.out.println("String at index 1: " + str);

        // set a string in the array to a new value
        array.set(2, "Everyone"); // set the string at index 2 to "Everyone"

        // remove a string from the array
        array.remove(0); // remove the string at index 0 (which should be "Hello")

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
