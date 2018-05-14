import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {

    Anagram anagram = new Anagram();

    @Test (expected=NullPointerException.class)
    public void anagramForNull(){
        anagram.areTheyAnagrams(null,null);
    }

    @Test
    public void anagramForZeroLength() {
        Assert.assertTrue(anagram.areTheyAnagrams("",""));
    }

    @Test
    public void anagramForDifferentLength() {
        Assert.assertFalse(anagram.areTheyAnagrams("zsemle","szem"));
    }

    @Test
    public void anagramBad() {
        Assert.assertFalse(anagram.areTheyAnagrams("zsák","szemle"));
    }

    @Test
    public void anagramGood() {
        assertTrue(anagram.areTheyAnagrams("zsemle","szeMle"));
    }

}