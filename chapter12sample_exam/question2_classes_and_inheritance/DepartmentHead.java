package chapter12sample_exam.question2_classes_and_inheritance;


public class DepartmentHead extends Employee
{
    private String departmentName;

    public DepartmentHead(String id, String fullName, String departmentName)
    {
        super(id, fullName);
        this.departmentName = departmentName;
    }
}
