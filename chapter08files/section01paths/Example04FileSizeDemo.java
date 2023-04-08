package chapter08files.section01paths;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Example04FileSizeDemo
{
    public static void main(String[] args) throws IOException
    {
        Path newPath = Paths.get("chapter08files/io/SubDirectory1/Sub1File1.txt");
        System.out.println("Size: " + Files.size(newPath) + " bytes");
    }
}
