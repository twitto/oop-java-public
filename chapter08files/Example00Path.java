package chapter08files;

import java.nio.file.*;
import java.nio.file.attribute.FileTime;

public class Example00Path {
    public static void main(String[] args) {
        // Create a Path object representing a directory
        Path path = Paths.get("/home/user/Documents");

        // Get information about the path
        System.out.println("Path: " + path.toString());
        System.out.println("Root: " + path.getRoot());
        System.out.println("Parent: " + path.getParent());
        System.out.println("Name: " + path.getFileName());

        // Create a new path by resolving a relative path
        Path subPath = path.resolve("subdir");
        System.out.println("Sub-path: " + subPath);

        // Check if the path exists and is a directory
        boolean exists = Files.exists(path);
        boolean isDir = Files.isDirectory(path);
        System.out.println("Exists: " + exists);
        System.out.println("Is directory: " + isDir);

        // Create a new path by appending a path element
        Path newPath = path.resolve("file.txt");
        System.out.println("New path: " + newPath);

        // Check if the path exists and is a file
        exists = Files.exists(newPath);
        boolean isFile = Files.isRegularFile(newPath);
        System.out.println("Exists: " + exists);
        System.out.println("Is file: " + isFile);

        // Get the file size
        try {
            long size = Files.size(newPath);
            System.out.println("Size: " + size + " bytes");
        } catch (Exception e) {
            System.out.println("Error getting file size: " + e.getMessage());
        }

        // Iterate over all elements of the path
        System.out.println("Path elements:");
        for (Path element : newPath) {
            System.out.println(element);
        }

        // Normalize the path
        Path normalizedPath = Paths.get("/home/user/../user/Documents/./file.txt").normalize();
        System.out.println("Normalized path: " + normalizedPath);
    }
}
