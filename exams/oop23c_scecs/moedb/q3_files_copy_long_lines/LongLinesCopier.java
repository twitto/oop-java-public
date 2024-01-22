package exams.oop23c_scecs.moedb.q3_files_copy_long_lines;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LongLinesCopier
{
    public static void copyLongLinesFromFile(String fileName) throws IOException
    {
        Path filePath = Paths.get(fileName);
        List<String> lines = Files.readAllLines(filePath);

        List<String> longLines = new ArrayList<>();
        for (String line : lines)
            if (line.length() > 10)  // Check if the line has more than 10 characters
                longLines.add(line);

        Path outputPath = Paths.get("longLinesOnly.txt");
        Files.write(outputPath, longLines);
    }
}
