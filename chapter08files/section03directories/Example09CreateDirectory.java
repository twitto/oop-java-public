package chapter08files.section03directories;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Example09CreateDirectory
{
    public static void main(String[] args) throws Exception
    {
        Path path = Paths.get("chapter08files/io/NewDir");
        Files.createDirectory(path);

        path = Paths.get("chapter08files/io/NewDir1/NewDir2/NewDir3");
        Files.createDirectories(path);
    }
}
