package chapter06specials.records.example02generic;

public class Main
{
    public static void main(String[] args)
    {
        Pair<String, Integer> pair = new Pair<>("hello", 42);
        System.out.println(pair.first());  // prints "hello"
        System.out.println(pair.second()); // prints "42"
    }

}
