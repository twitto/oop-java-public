package exams.oop23b_scecs_moeda.q4_singlylinkedlist;

public class Link<T>
{
    private T data;
    private Link<T> next;

    public Link(T data)
    {
        this.data = data;
        this.next = null;
    }

    public T getData()
    {
        return data;
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
