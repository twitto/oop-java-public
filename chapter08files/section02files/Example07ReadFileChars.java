package chapter08files.section02files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Example07ReadFileChars {
    public static void main(String[] args) throws Exception {
        Path filePath = Paths.get("example.txt");
        BufferedReader reader = new BufferedReader(new FileReader(filePath.toFile()));
        int character;
        while ((character = reader.read()) != -1) {
            System.out.print((char) character);
        }
        reader.close();
    }
}
