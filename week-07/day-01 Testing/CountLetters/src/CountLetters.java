import java.util.HashMap;

public class CountLetters {

    public static HashMap<Character, Integer> letterDictionary (String stringToMap) {
        HashMap<Character, Integer> letterMap = new HashMap<>();
        for ( char letter : stringToMap.toCharArray()) {
            if (letterMap.get(letter) == null) {
                letterMap.put(letter,1);
            } else {
                letterMap.put(letter,letterMap.get(letter) + 1);
            }
        }
        return letterMap;
    }

}
