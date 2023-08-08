package exams.oop23b_scecs_moedb.q3_files_reverse_file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileReverser
{
    public static void reverseFile(String fileName) throws IOException
    {
        Path filePath = Paths.get(fileName);

        List<String> lines = Files.readAllLines(filePath);
        List<String> reversedLines = new ArrayList<>();

        for (int i = lines.size() - 1; i >= 0; i--)
            reversedLines.add(lines.get(i));

        Path outputPath = Paths.get("reversedFile.txt");
        Files.write(outputPath, reversedLines);
    }
}

