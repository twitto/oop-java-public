package chapter08files.section03directories;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Example13TraverseDirectoryRecursively {
    public static void main(String[] args) throws Exception {
        Path path = Paths.get("path/to/directory");
        traverseDirectoryRecursively(path);
    }

    private static void traverseDirectoryRecursively(Path directory) throws IOException {
        if (Files.isDirectory(directory)) {
            DirectoryStream<Path> stream = Files.newDirectoryStream(directory);
            for (Path file : stream) {
                if (Files.isDirectory(file)) {
                    traverseDirectoryRecursively(file);
                } else {
                    System.out.println(file.getFileName());
                }
            }
            stream.close();
        } else {
            System.out.println(directory.getFileName());
        }
    }
}
