import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Created by aze on 2017.04.04..
 */
public class Extension {
  int add(int a, int b) {
    return a + b;
  }

  int maxOfThree(int a, int b, int c) {
    if (a > b) {
      if (a > c) {
        return a;
      } else {
        return c;
      }
    } else if (c < b) {
      return b;
    } else {
      return c;
    }
  }

  int median(List<Integer> pool) {
    pool.sort(Comparator.naturalOrder());
    return pool.get((pool.size()-1)/2);
  }

  boolean isVowel(char c) {
    return Arrays.asList('a', 'á', 'u', 'ú', 'ü', 'ű', 'o', 'ó', 'ö', 'ő', 'e', 'é', 'i', 'í').contains(c);
  }

  String translate(String hungarian) {
    StringBuilder stringBuilder = new StringBuilder(hungarian);
    for (int i = 0; i < stringBuilder.length(); i++) {
      char c = stringBuilder.charAt(i);
      if (isVowel(c)) {
        stringBuilder.insert(i, 'v');
        stringBuilder.insert(i, c);
        i+=2;
      }
    }
    return stringBuilder.toString();
  }
}