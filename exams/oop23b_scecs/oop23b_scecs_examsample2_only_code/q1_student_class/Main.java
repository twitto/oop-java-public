package exams.oop23b_scecs.oop23b_scecs_examsample2_only_code.q1_student_class;

public class Main
{
    // Example of usage
    public static void main(String[] args) {
        // Creating student objects
        Student student1 = new Student("Alice", 18, 87.5);
        Student student2 = new Student("Bob", 19, 76.8);

        // Checking equality
        System.out.println("Are students equal? " + student1.equals(student2));

        // Updating grade
        student1.updateGrade(90.0);
        System.out.println("Updated grade for " + student1.getName() + ": " + student1.getGrade());
    }


}
