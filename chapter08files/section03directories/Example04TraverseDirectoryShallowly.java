package chapter08files.section03directories;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Example04TraverseDirectoryShallowly
{
    public static void main(String[] args) throws Exception
    {
        Path path = Paths.get("chapter08files/io");
        traverseDirectory(path);
    }

    private static void traverseDirectory(Path directory) throws IOException
    {
        if (Files.exists(directory)) {
            DirectoryStream<Path> stream = Files.newDirectoryStream(directory);
            for (Path file : stream)
                System.out.println(file.getFileName());
            stream.close();
        }
    }
}
