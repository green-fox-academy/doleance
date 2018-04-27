import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
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
        boolean areTheSameInTheRow = true;
        boolean areTheSameInTheColumn = true;
        boolean areTheSameInDiagonal = true;
        int howManyRows = ticTacResult.size();
        for (int i = 0; i < howManyRows; i++) {
            char firstChar = ticTacResult.get(i).charAt(0);
            for (int j = 1; j < howManyRows; j++) {
                areTheSameInTheRow = (ticTacResult.get(i).charAt(j) == ticTacResult.get(i).charAt(j - 1));
                areTheSameInTheColumn = (ticTacResult.get(j).charAt(i) == ticTacResult.get(j - 1).charAt(i));
                areTheSameInDiagonal = (ticTacResult.get(j).charAt(j) == ticTacResult.get(j - 1).charAt(j - 1));
            }
            if (areTheSameInTheRow || areTheSameInTheColumn || areTheSameInDiagonal) {
                return ticTacResult.get(i).substring(howManyRows - 1);
            }
        }
        return "draw";
    }
}