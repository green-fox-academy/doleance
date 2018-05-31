import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedOrder {

    public static void main(String[] args) {
        // Create a method that decrypts reversed-order.txt
        Path path = Paths.get("src/reversed-order.txt");

        List<String> fileContent = new ArrayList<>();
        try {
            fileContent = Files.readAllLines(path);
        } catch (IOException e) {
            System.out.println("Oh, where are my glasses?");
        }

        FileWriter fw;
        try {
            fw = new FileWriter("src/re-reversed-order.txt");
            for (int i = fileContent.size() - 1; i >= 0; i--) {
                fw.write(fileContent.get(i));
                fw.write("\n");
            }
            fw.close();
        } catch (IOException e) {
            System.out.println("Oh, where is my pen?");
        }




    }
}