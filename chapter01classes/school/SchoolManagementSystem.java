// Package declaration
package chapter01classes.school;

import chapter01classes.school.Course;
import chapter01classes.school.Student;
import chapter01classes.school.Teacher;

// Class 1: Main class
public class SchoolManagementSystem {
    public static void main(String[] args) {
        System.out.println("Welcome to our School Management System!");

        // Creating objects of other classes
        Teacher teacher1 = new Teacher("John Doe", "Mathematics");
        Student student1 = new Student("Alice Smith", 15);
        student1.name = "bob";
        Course course1 = new Course("Mathematics", teacher1);

        // Enroll student in course
        course1.enrollStudent(student1);

        // Display course details
        course1.displayCourse();
    }
}

