package exams.oop23b_scecs_moeda.q4_singlylinkedlist;

public class SinglyLinkedList<T> implements LinkedList<T>
{
    private Link<T> head;

    public SinglyLinkedList()
    {
        this.head = null;
    }

    public void add(T element)
    {
        Link<T> newLink = new Link<>(element);
        if (head == null)
            head = newLink;
        else {
            Link<T> current = head;
            while (current.getNext() != null)
                current = current.getNext();
            current.setNext(newLink);
        }
    }

    public T get(int index)
    {
        if (head == null)
            throw new IndexOutOfBoundsException("List is empty");
        if (index < 0)
            throw new IndexOutOfBoundsException("Invalid index: " + index);

        Link<T> current = head;
        for (int i = 0; i < index; i++) {
            if (current.getNext() == null)
                throw new IndexOutOfBoundsException("Index out of bounds: " + index);
            current = current.getNext();
        }

        return current.getData();
    }

    public void remove(T element)
    {
        if (head == null)
            return;

        if (head.getData().equals(element)) {
            head = head.getNext();
            return;
        }

        Link<T> current = head;
        while (current.getNext() != null) {
            if (current.getNext().getData().equals(element)) {
                current.setNext(current.getNext().getNext());
                return;
            }
            current = current.getNext();
        }
    }
}
