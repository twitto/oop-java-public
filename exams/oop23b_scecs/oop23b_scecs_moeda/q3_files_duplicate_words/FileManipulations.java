package exams.oop23b_scecs.oop23b_scecs_moeda.q3_files_duplicate_words;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileManipulations
{
    public static void duplicateWordsInFile(String fileName) throws IOException
    {
        Path inputPath = Paths.get(fileName);
        List<String> lines = Files.readAllLines(inputPath);

        List<String> duplicatedLines = new ArrayList<>();
        for (String line : lines)
            duplicatedLines.add(line + line);

        Path outputPath = Paths.get("duplicated.txt");
        Files.write(outputPath, duplicatedLines);
    }
}
