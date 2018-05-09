import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedLines {

    public static void main(String[] args) {
        // Create a method that decrypts reversed-lines.txt

        Path path = Paths.get("src/reversed-lines.txt");
        List fileLines = new ArrayList();
        List newFileLines = new ArrayList();

        try {
            fileLines = Files.readAllLines(path);
        } catch (IOException e) {
            System.out.println("I can't read that file.");
        }

        for (int i = 0; i < fileLines.size(); i++) {
            String tempLine = "";
            for (int j = fileLines.get(i).toString().length() - 1; j >= 0; j--) {
                tempLine += fileLines.get(i).toString().charAt(j);
            }
            newFileLines.add(tempLine);
        }

        Path pathToWrite = Paths.get("src/deversed-lines.txt");
        try {
            Files.write(pathToWrite, newFileLines);
        } catch (IOException e) {
            System.out.println("I don't know why, but I can't write the file.");
        }

    }
}