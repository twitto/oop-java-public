package chapter12sample_exam.question2_classes_and_inheritance;

import java.util.Objects;

public abstract class Employee
{
    private String id;
    private String fullName;

    public Employee(String id, String fullName)
    {
        this.id = id;
        this.fullName = fullName;
    }

    public String toString()
    {
        return "Employee{id=" + id + ", fullName=" + fullName + '}';
    }

    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(id, employee.id) &&
                Objects.equals(fullName, employee.fullName);
    }
}
