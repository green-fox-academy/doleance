import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Lottery {

    public static void main(String[] args) {
        // Create a method that find the 5 most common lottery numbers in lottery.csv
        Path path = Paths.get("src/lottery.csv");
        Map<Integer, Integer> lotteryNumbers = new HashMap<>();

        mapingNumberFrequency(path, lotteryNumbers);
        System.out.println("The most common lottery numbers:");
        for ( Integer number : mostFrequentNumbers(lotteryNumbers, 5)) {
            System.out.println(number + " (" + lotteryNumbers.get(number) + " times) ");
        }
    }

    private static ArrayList<Integer> mostFrequentNumbers(Map<Integer,Integer> lotteryNumbers, int howManyNumber) {
        ArrayList<Integer> mostFrequentNumbers = new ArrayList<>();
        int max = -1;
        do {
            max = findTheMaxFreq(lotteryNumbers, max);
            findTheKeys(lotteryNumbers, mostFrequentNumbers, howManyNumber - mostFrequentNumbers.size(), max);
        } while (mostFrequentNumbers.size() < howManyNumber);
        return  mostFrequentNumbers;
    }

    private static void findTheKeys(Map<Integer, Integer> lotteryNumbers, ArrayList<Integer> numberArray, int howManyToGo, int max) {
        for (Map.Entry<Integer, Integer> entry : lotteryNumbers.entrySet()) {
            if ((entry.getValue() == max) && (howManyToGo > 0)) {
                numberArray.add(entry.getKey());
                howManyToGo--;
            }
        }
    }

    private static int findTheMaxFreq(Map<Integer,Integer> lotteryNumbers, int lastBiggest) {
        Integer max = null;
        for (Map.Entry<Integer, Integer> entry : lotteryNumbers.entrySet()) {

            if (max == null
                    || ((entry.getValue().compareTo(max) > 0) &&
                    ((entry.getValue() < lastBiggest) || (lastBiggest == -1)))) {
                max = entry.getValue();
            }
        }
        return max;
    }

    private static void mapingNumberFrequency(Path path, Map<Integer, Integer> toWhere) {
        List<String> fileContent = new ArrayList<>();

        try {
            fileContent = Files.readAllLines(path);
        } catch (IOException e) {
            System.out.println("I can't see.");
        }

        String[] lineStringArray;
        Integer tempNumber;
        for ( String line : fileContent) {
            lineStringArray = line.split(";");
            for (int i = 1; i < 6; i++) {
                tempNumber = Integer.parseInt(lineStringArray[lineStringArray.length - i]);
                if (toWhere.containsKey(tempNumber)) {
                    toWhere.put(tempNumber, toWhere.get(tempNumber) + 1);
                } else {
                    toWhere.put(tempNumber, 1);
                }
            }
        }
    }
}