import java.util.*;

public class QuoteSwap{
  public static void main(String... args){
    ArrayList<String> list = new ArrayList<String>(Arrays.asList("What", "I", "do", "create,", "I", "cannot", "not", "understand."));

    // Accidentally I messed up this quote from Richard Feynman.
    // Two words are out of place
    // Your task is to fix it by swapping the right words with code
    // Create a method called quoteSwap().

    // Also, print the sentence to the output with spaces in between.
    System.out.println(quoteSwap2(list));
    // Expected output: "What I cannot create I do not understand."

  }

  public static String quoteSwap (ArrayList badQuote) {
    Collections.swap(badQuote, 2, 5);
    return String.join(" ",badQuote);
  }

  //vagy

  public static String quoteSwap2 (ArrayList badQuote) {
    badQuote.set(2, badQuote.set(5, badQuote.get(2)));
    return String.join(" ",badQuote);
  }

  //úristen, ez működik! :O

}