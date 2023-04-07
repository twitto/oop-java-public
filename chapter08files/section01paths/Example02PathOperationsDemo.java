package chapter08files.section01paths;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Example02PathOperationsDemo {
    public static void main(String[] args) {
        Path path = Paths.get("/home/user/Documents");

        Path subPath = path.resolve("subdir");
        System.out.println("Sub-path: " + subPath);

        boolean exists = Files.exists(path);
        boolean isDir = Files.isDirectory(path);
        System.out.println("Exists: " + exists);
        System.out.println("Is directory: " + isDir);

        Path newPath = path.resolve("file.txt");
        System.out.println("New path: " + newPath);

        exists = Files.exists(newPath);
        boolean isFile = Files.isRegularFile(newPath);
        System.out.println("Exists: " + exists);
        System.out.println("Is file: " + isFile);
    }
}
