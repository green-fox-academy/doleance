import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.*;

public class WriteSingleLine {
    public static void main(String[] args) {
        // Open a file called "my-file.txt"
        // Write your name in it as a single line
        // If the program is unable to write the file,
        // then it should print an error message like: "Unable to write file: my-file.txt"

        Path path = Paths.get("my-file.txt");
        if (!Files.isWritable(path)) {
            System.out.println("Unable to write file: " + path.getFileName());
        } else {
            ArrayList<String> whatToWrite = new ArrayList<>();
            whatToWrite.add("Ivett Laták");
            try {
                Files.write(path, whatToWrite);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}