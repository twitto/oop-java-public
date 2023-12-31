package exams.oop23b_scecs.oop23b_scecs_moedb.q4_doubly_linked_list;

public class DoublyLinkedList<T> implements LinkedList<T>
{
    private Link<T> first;
    private Link<T> last;

    public DoublyLinkedList()
    {
        first = null;
        last = null;
    }

    public void add(T element)
    {
        Link<T> newLink = new Link<>(element);

        if (first == null) {
            first = newLink;
            last = newLink;
        } else {
            last.setNext(newLink);
            newLink.setPrevious(last);
            last = newLink;
        }
    }

    public T get(int index) throws IndexOutOfBoundsException
    {
        if (index < 0)
            throw new IndexOutOfBoundsException();

        Link<T> current = first;
        for (int i = 0; i < index; i++) {
            if (current == null)
                throw new IndexOutOfBoundsException();
            current = current.getNext();
        }

        if (current == null)
            throw new IndexOutOfBoundsException();

        return current.getData();
    }

    public void remove(T element)
    {
        Link<T> current = first;

        while (current != null) {
            if (current.getData().equals(element)) {
                Link<T> previous = current.getPrevious();
                Link<T> next = current.getNext();

                if (previous != null)
                    previous.setNext(next);
                else
                    first = next;

                if (next != null)
                    next.setPrevious(previous);
                else
                    last = previous;

                break;
            }

            current = current.getNext();
        }
    }
}
