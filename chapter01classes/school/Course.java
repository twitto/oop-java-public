package chapter01classes.school;

import java.util.ArrayList;

// Class 4: Course class
class Course {
    private String name;
    private Teacher teacher;
    private ArrayList<Student> students = new ArrayList<>();

    public Course(String name, Teacher teacher) {
        this.name = name;
        this.teacher = teacher;
    }

    public void enrollStudent(Student student  ) {
        students.add(student);
    }

    public void displayCourse() {
        System.out.println("Course: " + name);
        System.out.println("Teacher: " + teacher.getName());
        System.out.println("Students enrolled:");
        for (Student student : students) {
            System.out.println("- " + student.getName());
        }
    }

    // Other methods like calculateAverageGrade, etc...
}
