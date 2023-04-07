package chapter08files;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Example01CreateFile {
    public static void main(String[] args) throws Exception {
        Path filePath = Paths.get("example.txt");
        Files.createFile(filePath);
        System.out.println("File created successfully.");
    }
}
