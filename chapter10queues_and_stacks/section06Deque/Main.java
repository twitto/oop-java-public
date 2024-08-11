package chapter10queues_and_stacks.section06Deque;

public class Main {

    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>(5); //[]

        deque.addFirst(1); //[1]
        deque.addLast(2); //[1, 2]
        deque.addFirst(3); //[3, 1, 2]
        deque.addLast(4);  //[3, 1, 2, 4]
        deque.addFirst(5); //[5, 3, 1, 2, 4]

        System.out.println("First element: " + deque.getFirst()); // 5
        System.out.println("Last element: " + deque.getLast());   // 4

        System.out.println("Removed from front: " + deque.removeFirst()); // 5
        System.out.println("Removed from back: " + deque.removeLast());   // 4

        System.out.println("Size of deque: " + deque.size()); // 3
    }
}
