package exams.oop23c_scecs.moeda.q3_even_lines_duplicator;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        // Create a sample input file
        List<String> sampleLines = Arrays.asList(
                "This is line 0",
                "This is line 1",
                "ABC XYZ",
                "12 34 56",
                "Line line line"
        );
        Path sampleFilePath = Paths.get("document.txt");
        Files.write(sampleFilePath, sampleLines);

        // Use the method to copy even lines
        EvenLinesDuplicator.copyEvenLinesFromFile("document.txt");

        System.out.println("Even lines copied to evenLinesOnly.txt.");
    }
}