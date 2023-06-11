package chapter09lists.section03linkedlist;

public class Main
{
    public static void main(String[] args)
    {
        LinkedList<Integer> myList = new LinkedList<>();
        System.out.println(myList.size()); // 0

        myList.add(10);
        myList.add(20);
        myList.add(30);
        System.out.println(myList.size()); // 3

        myList.remove(20);
        System.out.println(myList.size()); // 2

    }
}
