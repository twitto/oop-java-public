package exams.oop23b_scecs.oop23b_scecs_examsample2_only_code.q4_stack;

// Example usage:
public class Main {
    public static void main(String[] args) {
        ArrayStack<Integer> stack = new ArrayStack<>();
        stack.push(5);
        stack.push(10);
        stack.push(15);

        try {
            while (!stack.isEmpty()) {
                System.out.println(stack.pop());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
