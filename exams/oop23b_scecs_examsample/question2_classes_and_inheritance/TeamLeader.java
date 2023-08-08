package exams.oop23b_scecs_examsample.question2_classes_and_inheritance;

public class TeamLeader extends Developer
{
    protected String teamName;

    public TeamLeader(String id, String fullName, String
            mainProgrammingLanguage, String teamName)
    {
        super(id, fullName, mainProgrammingLanguage);
        this.teamName = teamName;
    }
}
