package chapter09lists.section01arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Example05ArrayListReverse
{
    public static void main(String[] args)
    {
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        Collections.reverse(names);
        System.out.println(names); //[Charlie, Bob, Alice]
    }
}
