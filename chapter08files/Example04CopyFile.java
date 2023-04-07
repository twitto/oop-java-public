package chapter08files;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Example04CopyFile {
    public static void main(String[] args) throws Exception {
        Path sourceFilePath = Paths.get("example.txt");
        Path destinationFilePath = Paths.get("example_copy.txt");
        Files.copy(sourceFilePath, destinationFilePath);
        System.out.println("File copied successfully.");
    }
}
