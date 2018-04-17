public class SubStrList {
  public static void main(String[] args) {
    //  Create a function that takes a string and a list of string as a parameter
    //  Returns the index of the string in the list where the first string is part of
    //  Only need to find the first occurence and return the index of that
    //  Returns `-1` if the string is not part any of the strings in the list
    
    //  Example
    String[] searchArr = new String[] {"this", "is", "what", "I'm", "searching"};
    System.out.println(subStrList("ching", searchArr));
    //  should print: `4`
    System.out.println(subStrList("not", searchArr));
    //  should print: `-1`  
  }

  public static int subStrList(String lookingFor, String[] searchArray) {
    String currentWord = "";
    for (int i = 0; i < searchArray.length; i++) {
      currentWord = searchArray[i];
      for (int j = 0; j < currentWord.length(); j++) {
        for (int k = j; k < currentWord.length()+1; k++) {
          if (currentWord.substring(j,k).equals(lookingFor)) {
            return i;
          }
        }
      }
    }
    return -1;
  }
}