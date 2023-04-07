package chapter08files.section02files;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.BufferedReader;
import java.io.FileReader;

public class Example06ReadFileLines {
    public static void main(String[] args) throws Exception {
        Path filePath = Paths.get("example.txt");
        BufferedReader reader = new BufferedReader(new FileReader(filePath.toFile()));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
    }
}
