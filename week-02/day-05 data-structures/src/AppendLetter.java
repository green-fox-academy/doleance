import java.util.*;

public class AppendLetter{
  public static void main(String... args){
    List<String> far = Arrays.asList("kuty", "macsk", "kacs", "rók", "halacsk");
    // Create a method called "appendA()" that adds "a" to every string in the "far" list.
    // The parameter should be a list.

    System.out.println(appendA(far));
  }

  public static String appendA (List<String> listWithoutA) {
    String appended;
    for (int i = 0; i < listWithoutA.size(); i++) {
      listWithoutA.set(i,listWithoutA.get(i)+"a");
    }
    return String.join(", ",listWithoutA);
  }

}


// The output should be: "kutya", "macska", "kacsa", "róka", "halacska"