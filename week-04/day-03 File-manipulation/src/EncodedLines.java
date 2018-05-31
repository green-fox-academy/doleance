import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class EncodedLines {

    public static void main(String[] args) {
        // Create a method that decrypts encoded-lines.txt
        Path pathIn = Paths.get("src/encoded-lines.txt");
        List<String> fileContent = new ArrayList<>();
        try {
            fileContent = Files.readAllLines(pathIn);
        } catch (IOException e) {
            System.out.println("I can't even look.");
        }

        StringBuilder stringBuilder = new StringBuilder();
        FileWriter fw;
        for (int i = 0; i < fileContent.size(); i++) {
            for (int j = 0; j < fileContent.get(i).length(); j++) {
                if (fileContent.get(i).charAt(j) == ' ') {
                    stringBuilder.append(' ');
                } else {
                    stringBuilder.append((char) (int) (fileContent.get(i).charAt(j) - 1));
                }
            }
            try {
                fw = new FileWriter("src/un-encoded-lines.txt");
                fw.write(stringBuilder.toString());
                System.out.println(stringBuilder.toString());
                stringBuilder.delete(0,stringBuilder.length());
            } catch (IOException e) {
                System.out.println("I can read, but i can't write.");
            }
        }

    }
}