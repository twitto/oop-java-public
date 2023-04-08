package chapter08files.section03directories;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Example14FilterDirectory
{
    public static void main(String[] args) throws IOException
    {
        Path directoryPath = Paths.get("chapter08files/io");

        // Search for files matching a pattern
        String pattern = "*example*.txt";
        DirectoryStream<Path> directoryStream = Files.newDirectoryStream(directoryPath, pattern);
        for (Path path : directoryStream)
            System.out.println(path.getFileName());
    }
}
