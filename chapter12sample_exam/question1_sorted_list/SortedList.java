package chapter12sample_exam.question1_sorted_list;

public interface SortedList<T extends Comparable<T>>
{
    void add(T element);

    void remove(T element);

    T get(int index);
}
