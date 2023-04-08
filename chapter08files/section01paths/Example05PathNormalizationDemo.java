package chapter08files.section01paths;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Example05PathNormalizationDemo {
    public static void main(String[] args) {
        Path path = Paths.get("./chapter08files/io/../SubDirectory1/./Sub1File1.txt");
        System.out.println("Path: " + path);
        Path normalizedPath = path.normalize();
        System.out.println("Normalized path: " + normalizedPath);
    }
}


