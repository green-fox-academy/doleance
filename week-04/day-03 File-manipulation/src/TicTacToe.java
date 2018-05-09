import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class TicTacToe {

    public static void main(String[] args) {
        // Write a function that takes a filename as string,
        // open and read it. The file data represents a tic-tac-toe
        // game result. Return 'X'/'O'/'draw' based on which player
        // has winning situation.

        System.out.println(ticTacResult("src/win-o.txt"));
        // should print O

        System.out.println(ticTacResult("src/win-x.txt"));
        // should print X

        System.out.println(ticTacResult("src/draw.txt"));
        // should print draw

    }

    private static String ticTacResult(String fileName) {
        Path path = Paths.get(fileName);
        try {
            List<String> ticTacResult = Files.readAllLines(path);
            return searchingForTheResult(ticTacResult);
        } catch (IOException e) {
            return "I can't read that file.";
        }
    }

    private static String searchingForTheResult(List<String> ticTacResult) {
        StringBuilder stringBuilder = new StringBuilder();
        boolean areTheSameInTheRow = false;
        boolean areTheSameInTheColumn = false;
        boolean areTheSameInDiagonal = false;

        int i = 0;
        while ((i < 3) && (!areTheSameInTheRow) && (!areTheSameInTheColumn)) {
            if (ticTacResult.get(i).charAt(0) == ticTacResult.get(i).charAt(1)) {
                if (ticTacResult.get(i).charAt(1) == ticTacResult.get(i).charAt(2)) {
                    areTheSameInTheRow = true;
                    stringBuilder.append(ticTacResult.get(i).charAt(2));
                    return stringBuilder.toString();
                }
            }
            if (ticTacResult.get(0).charAt(i) == ticTacResult.get(1).charAt(i)) {
                if (ticTacResult.get(1).charAt(i) == ticTacResult.get(2).charAt(i)){
                    areTheSameInTheColumn = true;
                    stringBuilder.append(ticTacResult.get(2).charAt(i));
                    return stringBuilder.toString();
                }
            }
            i++;
        }
        if (ticTacResult.get(0).charAt(0) == ticTacResult.get(1).charAt(1)) {
            if (ticTacResult.get(1).charAt(1) == ticTacResult.get(2).charAt(2)) {
                stringBuilder.append(ticTacResult.get(1).charAt(1));
                return stringBuilder.toString();
            }
        }
        if (ticTacResult.get(0).charAt(2) == ticTacResult.get(1).charAt(1)) {
            if (ticTacResult.get(1).charAt(1) == ticTacResult.get(2).charAt(0)) {
                stringBuilder.append(ticTacResult.get(1).charAt(1));
                return stringBuilder.toString();
            }
        }
        return"draw";
    }

}
