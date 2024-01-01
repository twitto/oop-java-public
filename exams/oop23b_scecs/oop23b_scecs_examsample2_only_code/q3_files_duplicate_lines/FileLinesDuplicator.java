package exams.oop23b_scecs.oop23b_scecs_examsample2_only_code.q3_files_duplicate_lines;

import java.io.IOException;
import java.nio.file.*;
import java.util.*;

public class FileLinesDuplicator
{
    public static void duplicateLinesInFile(String fileName) throws IOException
    {
        Path inputPath = Paths.get(fileName);
        List<String> lines = Files.readAllLines(inputPath);

        List<String> duplicatedLines = new ArrayList<>();
        for (String line : lines) {
            duplicatedLines.add(line);
            duplicatedLines.add(line);
        }

        Path outputPath = Paths.get("duplicatedLines.txt");
        Files.write(outputPath, duplicatedLines);
    }

}

