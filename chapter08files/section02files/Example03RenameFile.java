package chapter08files.section02files;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Example03RenameFile {
    public static void main(String[] args) throws Exception {
        Path filePath = Paths.get("example.txt");
        Path newFilePath = Paths.get("renamed_example.txt");
        Files.move(filePath, newFilePath);
        System.out.println("File renamed successfully.");
    }
}

