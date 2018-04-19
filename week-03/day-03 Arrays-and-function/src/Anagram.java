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

        /*int i=0;
        if (word1.length() == word2.length()) {
            while ((word1.charAt(i) == word2.charAt(i)) && i < word1.length()) {
                i++;
            }
        }
        Ezt meg lehet valahogy így csinálni? Mert ez hibádzik kicsit.*/
        int i;
        for (i = 0; i < word1.length(); i++) {
            if (word1.charAt(i) != word2.charAt(i))
            {break;}
        }

        if (i == word1.length()) {
            System.out.println("Yes, they are anagrams, congrats! <3");
        } else {
            System.out.println("Sorry, try harder. :(");
        }
    }
}
