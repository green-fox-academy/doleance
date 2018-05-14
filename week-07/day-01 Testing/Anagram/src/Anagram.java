import java.util.Arrays;

public class Anagram {

    public static boolean areTheyAnagrams(String word1, String word2) throws NullPointerException {
        if ((word1 == null) || (word2 == null)) {
            throw new NullPointerException("(At least) one of your words ain't no exist.");
        }
        if (word1.length() == word2.length()) {
            if (word1.length() == 0) {
                return true;
            } else {
                char[] tempCharArray1 = word1.toLowerCase().toCharArray();
                char[] tempCharArray2 = word2.toLowerCase().toCharArray();
                Arrays.sort(tempCharArray1);
                Arrays.sort(tempCharArray2);
                return (String.valueOf(tempCharArray1).equals(String.valueOf(tempCharArray2)));
            }
        } else {
            return false;
        }

    }

}
