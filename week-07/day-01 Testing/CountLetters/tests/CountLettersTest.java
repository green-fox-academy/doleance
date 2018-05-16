import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class CountLettersTest {

    private CountLetters countLetters = new CountLetters();
    private HashMap<Character, Integer> emptyDictionary = new HashMap<>();

    @Test(expected = NullPointerException.class)
    public void letterDictionaryForNull() {
        countLetters.letterDictionary(null);
    }

    @Test
    public void letterDictionaryForEmpty() {
        assertEquals(emptyDictionary,countLetters.letterDictionary(""));
    }

    @Test
    public void letterDictionaryForGoodnessSake() {
        HashMap<Character, Integer> testDictionary = new HashMap<>();
        emptyDictionary.put('h',1);
        emptyDictionary.put('e',1);
        emptyDictionary.put('l',2);
        assertEquals(emptyDictionary,countLetters.letterDictionary("hell"));
    }

}