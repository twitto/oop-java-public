package chapter08files.section02files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Example08ReadFileWords {
    public static void main(String[] args) throws Exception {
        Path filePath = Paths.get("example.txt");
        BufferedReader reader = new BufferedReader(new FileReader(filePath.toFile()));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] words = line.split(" ");
            for (String word : words) {
                System.out.println(word);
            }
        }
        reader.close();
    }
}

