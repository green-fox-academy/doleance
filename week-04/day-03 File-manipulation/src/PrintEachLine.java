import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;

public class PrintEachLine {
    public static void main(String[] args) {
        // Write a program that opens a file called "my-file.txt", then prints
        // each of lines form the file.
        // If the program is unable to read the file (for example it does not exists),
        // then it should print an error message like: "Unable to read file: my-file.txt"

        Path path = Paths.get("my-file.txt");
        try {
            Files.lines(path)
                    .forEach(sor -> System.out.println(sor));

        } catch (IOException e) {
            System.out.print("Unable to read file: ");
            System.out.print(path);
        }
    }
}