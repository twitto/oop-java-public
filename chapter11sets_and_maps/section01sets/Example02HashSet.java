package chapter11sets_and_maps.section01sets;

import java.util.HashSet;
import java.util.Set;

public class Example02HashSet
{
    public static void main(String[] args)
    {
        Set<String> hashSet = new HashSet<>(); // []
        hashSet.add("apple");
        hashSet.add("banana");
        hashSet.add("orange");
        hashSet.add("grape");
        System.out.println(hashSet); // [banana, orange, apple, grape]

        Set<String> setToAdd = Set.of("pineapple", "grape", "pear");
        hashSet.addAll(setToAdd);
        System.out.println(hashSet); // [banana, orange, apple, pear, pineapple, grape]

        Set<String> setToCheck = Set.of("banana", "grape", "kiwi");
        System.out.println(hashSet.containsAll(setToCheck)); // false

        Set<String> setToRemove = Set.of("banana", "orange");
        hashSet.removeAll(setToRemove);
        System.out.println(hashSet); // [apple, pear, pineapple, grape]

        Set<String> setToRetain = Set.of("apple", "pear", "pineapple");
        hashSet.retainAll(setToRetain);
        System.out.println(hashSet); // [apple, pear, pineapple]

        System.out.println(hashSet.size()); // 3
        System.out.println(hashSet.isEmpty()); // false
    }
}
