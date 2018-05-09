import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Doubled {

    public static void main(String[] args) {
        // Create a method that decrypts the duplicated-chars.txt 

        Path path = Paths.get("src/duplicated-chars.txt");
        List fileLines = new ArrayList();

        try {
            fileLines = Files.readAllLines(path);
        } catch (IOException e) {
            System.out.println("I can't read dat.");
        }

        for (int i = 0; i < fileLines.size(); i++) {
            for (int j = 0; j < fileLines.get(i).toString().length() - 1; j++) {
                if (fileLines.get(i).toString().charAt(j) == fileLines.get(i).toString().charAt(j + 1)) {
                    String tempLine = removeChar(fileLines.get(i).toString(), j + 1);
                    fileLines.remove(i);
                    fileLines.add(i, tempLine);
                    j--;
                }
            }
        }

        Path pathTo = Paths.get("src/duplicated-solved.txt");
        try {
            Files.write(pathTo, fileLines);
        } catch (IOException e) {
            System.out.println("Hey, I can't write to dat.");
        }


    }

    public static String removeChar(String stringToRemoveFrom, Integer whichChar) {
        String front = stringToRemoveFrom.substring(0, whichChar);
        String back = stringToRemoveFrom.substring(whichChar+1, stringToRemoveFrom.length());
        return front + back;
    }

}