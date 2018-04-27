// Write a function that copies a file to an other
// It should take the filenames as parameters
// It should return a boolean that shows if the copy was successful

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CopyFiles {
    public static void main(String[] args) {

        Path originalFile = Paths.get("my-file.txt");
        Path newFile = Paths.get("my-file-again.txt");

        System.out.println("I will copy for you a file into another. Look.");
        if (copyFile(originalFile,newFile)) {
            System.out.println("Great, I did it!");
        } else {
            System.out.println("I messed up. :(");
        }
    }

    private static boolean copyFile(Path originalFile, Path newFile) {
        try {
            Files.copy(originalFile, newFile);
            return true;
        } catch (IOException e) {
            return false;
        }
    }
}
