package exams.oop23b_scecs_moedb.q4_doubly_linked_list;

public class Link<T>
{
    private T data;
    private Link<T> previous;
    private Link<T> next;

    public Link(T data)
    {
        this.data = data;
        this.previous = null;
        this.next = null;
    }

    public T getData()
    {
        return data;
    }
    public void setData(T data) { this.data = data; }

    public Link<T> getPrevious()
    {
        return previous;
    }
    public void setPrevious(Link<T> previous)
    {
        this.previous = previous;
    }

    public Link<T> getNext()
    {
        return next;
    }
    public void setNext(Link<T> next)
    {
        this.next = next;
    }
}

