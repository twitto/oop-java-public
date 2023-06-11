package chapter09lists.section03linkedlist;

public class LinkedList<T> implements List<T> {
    private Link<T> first;
    private int size;

    public LinkedList() {
        this.first = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void add(T data) {
        Link<T> newNode = new Link<>(data);

        if (first == null) {
            first = newNode;
        } else {
            Link<T> current = first;

            while (current.next != null) {
                current = current.next;
            }

            current.next = newNode;
        }

        size++;
    }

    public void addFirst(T data) {
        Link<T> newNode = new Link<>(data);

        if (first == null) {
            first = newNode;
        } else {
            newNode.next = first;
            first = newNode;
        }

        size++;
    }

    public void remove(T data) {
        if (first == null) {
            return;
        }

        if (first.data.equals(data)) {
            first = first.next;
            size--;
            return;
        }

        Link<T> current = first;
        Link<T> previous = null;

        while (current != null && !current.data.equals(data)) {
            previous = current;
            current = current.next;
        }

        if (current != null) {
            previous.next = current.next;
            size--;
        }
    }
}
