package chapter08files;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class Example05WriteFile {
    public static void main(String[] args) throws Exception {
        Path filePath = Paths.get("example.txt");
        BufferedWriter writer = new BufferedWriter(new FileWriter(filePath.toFile()));
        writer.write("Hello, world!");
        writer.write("\nHere is another line.");
        writer.write("\nThis is the last line. Bye...");
        writer.close();
        System.out.println("File written successfully.");
    }
}
