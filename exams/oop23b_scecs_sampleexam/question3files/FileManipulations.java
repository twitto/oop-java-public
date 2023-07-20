package exams.oop23b_scecs_sampleexam.question3files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileManipulations
{
    public static void reverseWordsInFile(String fileName) throws IOException
    {
        Path inputPath = Paths.get(fileName);
        List<String> lines = Files.readAllLines(inputPath);

        List<String> reversedLines = new ArrayList<>();
        for (String line : lines)
            reversedLines.add(reverseWord(line));

        Path outputPath = Paths.get("reversed.txt");
        Files.write(outputPath, reversedLines);
    }

    private static String reverseWord(String str)
    {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--)
            reversed += str.charAt(i);
        return reversed;
    }
}

