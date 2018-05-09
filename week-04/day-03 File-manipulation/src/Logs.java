// Read all data from 'log.txt'.
// Each line represents a log message from a web server
// Write a function that returns an array with the unique IP adresses.
// Write a function that returns the GET / POST request ratio.

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Logs {
    public static void main(String[] args) {
        Path path = Paths.get("src/log.txt");
        DecimalFormat numberFormat = new DecimalFormat("0.00");
        System.out.println("The Get/POST rate: "+
                numberFormat.format(getPostRequestRatio(path)));
        System.out.println("The unique IP-s are: ");
        uniqueIPs(path).stream().forEach(System.out::println);
    }

    private static double getPostRequestRatio(Path path) {
        int postCounter = 0;
        int getCounter = 0;
        try {
            List<String> fileContent = Files.readAllLines(path);

            System.out.println();
            for (int i = 0; i < fileContent.size(); i++) {
                String[] tempLineArray = fileContent.get(i).replaceAll("\\s{2,}", " ").split(" ");
                if (tempLineArray[6].equals("POST")) {
                    postCounter++;
                } else if (tempLineArray[6].equals("GET")) {
                    getCounter++;
                }
            }
            return countingRatio(postCounter,getCounter);

        } catch (IOException e) {
            System.out.println("I can't read that.");
        }
        return 0.0;
    }

    private static double countingRatio(int postCounter, int getCounter) {
        double ratio;
        try {
            ratio = (double)postCounter / (double)getCounter;
            return ratio;
        } catch (ArithmeticException e) {
            System.out.printf("There aren't any POST request. The number of GETS: %d.",getCounter);
            return -1;
        }
    }

    private static Set uniqueIPs(Path path) {
        Set<String> uniqueAddresses = new HashSet<>();
        try {
            List<String> fileContent = Files.readAllLines(path);
            for (int i = 0; i < fileContent.size(); i++) {
                String[] tempLineArray = fileContent.get(i).replaceAll("\\s{2,}", " ").split(" ");
                uniqueAddresses.add(tempLineArray[5]);
            }
        } catch (IOException e) {
            System.out.println("I can't read that.");
        }
        return uniqueAddresses;
    }

}
