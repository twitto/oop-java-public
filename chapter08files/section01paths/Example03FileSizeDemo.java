package chapter08files.section01paths;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Example03FileSizeDemo {
    public static void main(String[] args) {
        Path newPath = Paths.get("/home/user/Documents/file.txt");

        try {
            long size = Files.size(newPath);
            System.out.println("Size: " + size + " bytes");
        } catch (Exception e) {
            System.out.println("Error getting file size: " + e.getMessage());
        }
    }
}
