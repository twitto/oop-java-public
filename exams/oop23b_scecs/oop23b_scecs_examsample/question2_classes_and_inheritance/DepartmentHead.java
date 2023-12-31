package exams.oop23b_scecs.oop23b_scecs_examsample.question2_classes_and_inheritance;


public class DepartmentHead extends Employee
{
    protected String departmentName;

    public DepartmentHead(String id, String fullName, String departmentName)
    {
        super(id, fullName);
        this.departmentName = departmentName;
    }
}
