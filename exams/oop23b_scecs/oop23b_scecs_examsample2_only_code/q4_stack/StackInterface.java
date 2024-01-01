package exams.oop23b_scecs.oop23b_scecs_examsample2_only_code.q4_stack;

interface StackInterface<T>
{
    void push(T element);

    T pop() throws Exception;

    boolean isEmpty();
}