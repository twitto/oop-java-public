package chapter09lists.section01arraylist;

import java.util.ArrayList;
import java.util.List;

public class Example06ArrayListAddAll
{
    public static void main(String[] args)
    {
        List<String> names1 = new ArrayList<>();
        names1.add("Alice");
        names1.add("Bob");
        List<String> names2 = new ArrayList<>();
        names2.add("Charlie");
        names2.add("David");
        names1.addAll(names2);
        System.out.println(names1); //[Alice, Bob, Charlie, David]
    }
}
