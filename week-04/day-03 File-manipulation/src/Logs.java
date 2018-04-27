// Read all data from 'log.txt'.
// Each line represents a log message from a web server
// Write a function that returns an array with the unique IP adresses.
// Write a function that returns the GET / POST request ratio.

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Logs {
    public static void main(String[] args) {
        Path path = Paths.get("log.txt");
        getPostRequestRatio(path);
        uniqueIPs(path);
    }

    private static double getPostRequestRatio(Path path) {
        try {
            List<String> fileContent = Files.readAllLines(path);
        } catch (IOException e) {
            System.out.println("I can't read that.");
        }
        return 0.0;
    }

    private static ArrayList uniqueIPs(Path path) {
        ArrayList<String> uniqueAddresses = new ArrayList<>();

        return uniqueAddresses;
    }

}
