package chapter08files.section01paths;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Example04PathIterationDemo
{
    public static void main(String[] args)
    {
        Path newPath = Paths.get("chapter08files/io/SubDirectory1/Sub1File1.txt");

        System.out.println("Path elements:");
        for (Path element : newPath)
            System.out.println(element);
    }
}
