package exams.oop23c_scecs.moedb.q3_files_copy_long_lines;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException
    {
        // Sample usage of the LongLinesCopier class
        LongLinesCopier.copyLongLinesFromFile("sample.txt");
        System.out.println("Long lines have been copied to longLinesOnly.txt.");
    }
}
