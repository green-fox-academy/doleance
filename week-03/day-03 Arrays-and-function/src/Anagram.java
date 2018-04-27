import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Oh you think you've found an anagram, but you aren't sure? " +
                "Lemme check.\nType your words!");
        System.out.print("Your first word/line: ");
        String word1 = scan.nextLine();
        System.out.print("Your second word/line: ");
        String word2 = scan.nextLine();

        char[] chars1 = word1.toLowerCase().toCharArray();
        char[] chars2 = word2.toLowerCase().toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        word1 = String.valueOf(chars1);
        word2 = String.valueOf(chars2);

        if (areTheyAnagrams(word1, word2)) {
            System.out.println("Yes, they are anagrams, congrats! <3");
        } else {
            System.out.println("Sorry, try harder. :(");
        }
    }

    private static boolean areTheyAnagrams(String word1, String word2) {
        boolean areTheyReally = true;
        for (int i = 0; i < word1.length(); i++) {
            if (word1.charAt(i) != word2.charAt(i)) {
                areTheyReally = false;
                break;
            }
        }
        return areTheyReally;
    }

}
