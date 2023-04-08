package chapter09lists.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Example07ArrayListSubList
{
    public static void main(String[] args)
    {
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");
        List<String> subList = names.subList(1, 3);
        System.out.println(subList); //[Bob, Charlie]
    }
}
