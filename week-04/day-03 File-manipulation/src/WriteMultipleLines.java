// Create a function that takes 3 parameters: a path, a word and a number,
// than it should write to a file.
// The path parameter should be a string, that describes the location of the file.
// The word parameter should be a string, that will be written to the file as lines
// The number paramter should describe how many lines the file should have.
// So if the word is "apple" and the number is 5, than it should write 5 lines
// to the file and each line should be "apple"
// The function should not raise any error if it could not write the file.

import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

public class WriteMultipleLines {
    public static void main(String[] args) {
        Path path = Paths.get("multiline.txt");
        String word = "kai";
        int howManyTimes = 5;
        LinesToAFile(path, word, howManyTimes);
    }

    private static void LinesToAFile(Path path, String word, int howManyTimes) {
        List<String> whatToWrite = new ArrayList<>();
        for (int i = 0; i < howManyTimes; i++) {
            whatToWrite.add(word);
        }
        try {
            Files.write(path, whatToWrite);
        } catch (IOException e) {
            System.out.println("I can't write into that file.");
        }
    }
}
