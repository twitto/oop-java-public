package chapter08files.section03directories;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Example02DeleteEmptyDirectory
{
    public static void main(String[] args) throws Exception
    {
        Path path = Paths.get("chapter08files/io/NewDir");
        Files.delete(path);
    }
}
