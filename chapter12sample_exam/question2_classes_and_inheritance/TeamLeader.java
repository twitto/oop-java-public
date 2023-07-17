package chapter12sample_exam.question2_classes_and_inheritance;

public class TeamLeader extends Developer
{
    private String teamName;

    public TeamLeader(String id, String fullName, String
            mainProgrammingLanguage, String teamName)
    {
        super(id, fullName, mainProgrammingLanguage);
        this.teamName = teamName;
    }
}
