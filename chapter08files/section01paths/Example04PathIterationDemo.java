package chapter08files.section01paths;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Example04PathIterationDemo {
    public static void main(String[] args) {
        Path newPath = Paths.get("/home/user/Documents/file.txt");

        System.out.println("Path elements:");
        for (Path element : newPath) {
            System.out.println(element);
        }
    }
}
