import java.util.ArrayList;
import java.util.Arrays;

public class Unique {
  public static void main(String[] args) {
    //  Create a function that takes a list of numbers as a parameter
    //  Returns a list of numbers where every number in the list occurs only once

    //  Example
    System.out.println(unique(new int[] {1, 11, 34, 11, 52, 61, 1, 34}));
    //  should print: `[1, 11, 34, 52, 61]`

  }

  private static String unique(int[] ints) {
    int[] temp = new int[ints.length];
    Arrays.fill(temp, -200000000);
    int pieces = ints.length-1;
    for (int i = 0; i < ints.length; i++) {
      if (Arrays.binarySearch(temp, ints[i]) < 0) {
        temp[pieces] = ints[i];
        pieces--;
        Arrays.sort(temp);
      }
    }
    //System.out.println(Arrays.toString(temp));
    String arraysValuableElements = "[ ";
    for ( int e : temp) {
      if (e > -200000000) {
        arraysValuableElements += e + " ";
      }
    }
    arraysValuableElements += "]";
    return arraysValuableElements;
  }
}