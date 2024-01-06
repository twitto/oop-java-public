package exams.oop23c_scecs.moeda.q4_bounded_queue;

public class Main {
    public static void main(String[] args) {
        // Create a bounded queue with capacity of 5
        BoundedQueue<String> queue = new BoundedQueue<>(5);

        // Add elements to the queue
        System.out.println("Adding elements to the queue:");
        System.out.println(queue.add("First"));
        System.out.println(queue.add("Second"));
        System.out.println(queue.add("Third"));
        System.out.println(queue.add("Fourth"));
        System.out.println(queue.add("Fifth"));

        // Try adding an element beyond the capacity
        System.out.println(queue.add("Sixth"));  // This should print false

        // Remove elements from the queue
        System.out.println("\nRemoving elements from the queue:");
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());

        // Try removing an element from an empty queue
        System.out.println(queue.remove());  // This should print null
    }
}
