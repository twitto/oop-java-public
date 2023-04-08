package chapter08files.section02files;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Example04CopyFile {
    public static void main(String[] args) throws Exception {
        Path sourceFilePath = Paths.get("chapter08files/io/example.txt");
        Path destinationFilePath = Paths.get("chapter08files/io/example_copy.txt");
        Files.copy(sourceFilePath, destinationFilePath);
    }
}
