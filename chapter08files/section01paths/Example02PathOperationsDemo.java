package chapter08files.section01paths;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Example02PathOperationsDemo
{
    public static void main(String[] args)
    {
        Path path = Paths.get("chapter08files/io");

        System.out.println("path: " + path);
        System.out.println("Exists: " + Files.exists(path));
        System.out.println("Is directory: " + Files.isDirectory(path));

        Path subPath = path.resolve("SubDirectory1");
        System.out.println("path: " + path);
        System.out.println("Sub-path: " + subPath);

        Path newPath = subPath.resolve("Sub1File1.txt");
        System.out.println("New path: " + newPath);
        System.out.println("Exists: " + Files.exists(newPath));
        System.out.println("Is file: " + Files.isRegularFile(newPath));
    }
}
