package exams.oop23b_scecs_sampleexam.question3files;

import java.io.IOException;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        String fileName = "input.txt";
        FileManipulations.reverseWordsInFile(fileName);
        System.out.println("Words reversed successfully.");
    }
}
