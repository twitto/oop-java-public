package chapter08files.section03directories;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Example10DeleteEmptyDirectory
{
    public static void main(String[] args) throws Exception
    {
        Path path = Paths.get("path/to/directory");
        Files.delete(path);
    }
}
