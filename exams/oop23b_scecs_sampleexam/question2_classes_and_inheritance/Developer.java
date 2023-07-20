package exams.oop23b_scecs_sampleexam.question2_classes_and_inheritance;

public class Developer extends Employee
{
    protected String mainProgrammingLanguage;

    public Developer(String id, String fullName, String mainProgrammingLanguage)
    {
        super(id, fullName);
        this.mainProgrammingLanguage = mainProgrammingLanguage;
    }
}
