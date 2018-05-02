//Watch out! This class has all the two palindrom-functions we need. :)

import java.util.Arrays;

public class Palindrome {
    public static void main(String[] args) {

        String makeMePalindrome = "dog";
        createPalindrome(makeMePalindrome);

        String wannaBePalindrome = "géza kék azég";
        findPalindrome(wannaBePalindrome);

    }

    private static void createPalindrome(String makeMePalindrome) {
        System.out.print(makeMePalindrome);
        StringBuilder palindromeBuilding = new StringBuilder(makeMePalindrome);
        System.out.println(palindromeBuilding.reverse().toString());
    }

    private static void findPalindrome(String palindromeWord) {
        String[] foundPalindromes = new String[palindromeWord.length()];
        int db = 0;
        for (int i = 0; i < palindromeWord.length(); i++) {
            for (int j = i + 2; j <= palindromeWord.length(); j++) {
                if (ifPalindrome(palindromeWord.substring(i,j))) {
                    foundPalindromes[db] = palindromeWord.substring(i,j);
                    db++;
                }
            }
        }
        if (db == 0) {
            System.out.println("There isn't any palindromes here, sorry.");
        } else {
            System.out.println("Wow, we've got a couple of palindromes. Here:");
            for (int i = 0; i < db; i++) {
                System.out.print("\"" + foundPalindromes[i] + "\", ");
            }
        }
    }

    private static boolean ifPalindrome(String palindromeWord) {
        boolean whetherPalindrome = true;
        for (int i = 0; i < palindromeWord.length() / 2; i++) {
            if (!(palindromeWord.charAt(i) == palindromeWord.charAt(palindromeWord.length() - i - 1))) {
                whetherPalindrome = false;
                break;
            }
        }
        return whetherPalindrome;
    }
}
