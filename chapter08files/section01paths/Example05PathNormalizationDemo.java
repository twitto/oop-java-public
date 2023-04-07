package chapter08files.section01paths;
import java.nio.file.Path;
import java.nio.file.Paths;


public class Example05PathNormalizationDemo {
    public static void main(String[] args) {
        Path normalizedPath = Paths.get("/home/user/../user/Documents/./file.txt").normalize();
        System.out.println("Normalized path: " + normalizedPath);
    }
}


