package chapter08files.section01paths;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Example01PathInfoDemo
{
    public static void main(String[] args)
    {
        Path path = Paths.get("chapter08files/io/SubDirectory1");
        System.out.println("Path: " + path.toString());
        System.out.println("Parent: " + path.getParent());
        System.out.println("Name: " + path.getFileName());
    }
    //Path: chapter08files\io\SubDirectory1
    //Parent: chapter08files\io
    //Name: SubDirectory1
}
