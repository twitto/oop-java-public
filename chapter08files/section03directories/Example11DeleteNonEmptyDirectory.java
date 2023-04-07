package chapter08files.section03directories;

import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Example11DeleteNonEmptyDirectory {
    public static void main(String[] args) throws Exception {
        Path path = Paths.get("path/to/directory");
        deleteDirectory(path);
    }

    private static void deleteDirectory(Path directory) throws Exception {
        if (Files.exists(directory)) {
            DirectoryStream<Path> stream = Files.newDirectoryStream(directory);
            for (Path entry : stream) {
                if (Files.isDirectory(entry))
                    deleteDirectory(entry);
                else
                    Files.delete(entry);
            }

            Files.delete(directory);
        }
    }
}
