package chapter12sample_exam.question1_sorted_list;

import java.util.LinkedList;

public class SimpleSortedList<T extends Comparable<T>> implements SortedList<T> {
    private LinkedList<T> list;
    public SimpleSortedList() {
        list = new LinkedList<>();
    }
    public void add(T element) {
        int index = 0;
        while (index < list.size() && element.compareTo(list.get(index)) >= 0)
            index++;
        list.add(index, element);
    }
    public void remove(T element) {
        list.remove(element);
    }
    public T get(int index) {
        return list.get(index);
    }
}
