package chapter08files.section02files;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Example06ReadFile
{
    public static void main(String[] args) throws IOException
    {
        // Define the path to the file to be read
        Path filePath = Paths.get("chapter08files/io/example.txt");

        // Read the entire file as a byte array
        byte[] bytes = Files.readAllBytes(filePath);
        for (byte b : bytes)
            System.out.print((char)b);
        System.out.println("\n\n\n");

        // Read the entire file as a list of strings
        List<String> lines = Files.readAllLines(filePath);
        for (String line : lines)
            System.out.println(line);
        System.out.println("\n\n\n");

        // Read the entire file as a single string
        String content = Files.readString(filePath);
        System.out.println(content);
        System.out.println("\n\n\n");

        // split content to words
        String[] words = content.split("\\s+");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
