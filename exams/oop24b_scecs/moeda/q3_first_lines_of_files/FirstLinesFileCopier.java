package exams.oop24b_scecs.moeda.q3_first_lines_of_files;


import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

public class FirstLinesFileCopier {

    public static void copyFirstLinesOfFiles(String[] fileNames) throws IOException
    {
        Path outputPath = Paths.get("firstLinesOnly.txt");
        List<String> linesToWrite = new ArrayList<>();

        for (String fileName : fileNames) {
            Path inputPath = Paths.get(fileName);
            List<String> allLines = Files.readAllLines(inputPath);
            // Add up to the first 3 lines to the list
            for (int i = 0; i < 3 && i < allLines.size(); i++) {
                linesToWrite.add(allLines.get(i));
            }
        }

        Files.write(outputPath, linesToWrite);
    }

    public static void main(String[] args) throws IOException
    {
        // Example usage:
        String[] fileNames = {"doc1.txt", "doc2.txt"};
        copyFirstLinesOfFiles(fileNames);
    }
}
