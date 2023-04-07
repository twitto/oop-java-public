package chapter08files;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Example09CreateDirectory {
    public static void main(String[] args) throws Exception {
        Path path = Paths.get("path/to/directory");
        Files.createDirectory(path);
    }
}
