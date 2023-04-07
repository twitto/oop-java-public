package chapter08files.section03directories;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Example14FilterDirectory
{
    public static void main(String[] args)
    {
        Path directoryPath = Paths.get("/home/user/Documents");

        // List all files in a directory
        try (DirectoryStream<Path> directoryStream = Files.newDirectoryStream(directoryPath)) {
            for (Path path : directoryStream) {
                System.out.println(path.getFileName());
            }
        } catch (IOException e) {
            System.out.println("Error listing files: " + e.getMessage());
        }

        // Search for files matching a pattern
        String pattern = "*.txt";
        try (DirectoryStream<Path> directoryStream = Files.newDirectoryStream(directoryPath, pattern)) {
            for (Path path : directoryStream) {
                System.out.println(path.getFileName());
            }
        } catch (IOException e) {
            System.out.println("Error searching for files: " + e.getMessage());
        }
    }
}
