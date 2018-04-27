// Write a function that takes a filename as string,
// then returns the number of lines the file contains.
// It should return zero if it can't open the file, and
// should not raise any error.

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class CountLines {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please give me the filename: ");
        System.out.printf("You have %d lines in your file.",howManyLinesInFile(scan.nextLine()));
    }

    private static int howManyLinesInFile(String fileName) {
        Path path = Paths.get(fileName);
        try {
            return Files.readAllLines(path).size();
        } catch (IOException e) {
            return 0;
        }
    }
}
