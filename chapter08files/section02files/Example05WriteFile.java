package chapter08files.section02files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Example05WriteFile
{
    public static void main(String[] args) throws IOException
    {
        // Define a string to write to file using a text block
        String text = """
                This is an example
                of using Files.write()
                and Files.writeString()
                to write to a file.
                """;

        // Set the file path and file name
        Path filePath = Paths.get("chapter08files/io/example.txt");

        // Write the string to file using the 'WRITE' option
        Files.write(filePath, text.getBytes());

        // Append the string to file using the 'APPEND' option
        Files.writeString(filePath, "\n", StandardOpenOption.APPEND);
        Files.writeString(filePath, "Additional text.", StandardOpenOption.APPEND);
    }
}

