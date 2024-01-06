package exams.oop23c_scecs.moeda.q3_even_lines_duplicator;

import java.io.IOException;
import java.nio.file.*;
import java.util.*;

public class EvenLinesDuplicator
{
    public static void copyEvenLinesFromFile(String fileName) throws IOException
    {
        Path filePath = Paths.get(fileName);
        List<String> lines = Files.readAllLines(filePath);

        List<String> evenLines = new ArrayList<>();
        for (int i = 0; i < lines.size(); i++)
        {
            if (i % 2 == 0)  // Check if the line number is even
            {
                evenLines.add(lines.get(i));
            }
        }

        Path outputPath = Paths.get("evenLinesOnly.txt");
        Files.write(outputPath, evenLines);
    }
}
