package exams.oop23b_scecs.oop23b_scecs_examsample2_only_code.q1_student_class;

import java.util.Objects;

public class Student
{
    private String name;
    private int age;
    private double grade;


    // Constructor
    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // Method to get student information
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Grade: " + grade;
    }

    @Override
    public boolean equals(Object o) // this is s, o is s2
    {
        if (this == o)
            return true;

        if (o == null || this.getClass() != o.getClass())
            return false;

        Student student = (Student) o;
        return this.age == student.age
                && Double.compare(this.grade, student.grade) == 0
                && Objects.equals(this.name, student.name);
    }


    // Method to update grade
    public void updateGrade(double factor)
    {
        this.grade += factor;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public double getGrade()
    {
        return grade;
    }
}

