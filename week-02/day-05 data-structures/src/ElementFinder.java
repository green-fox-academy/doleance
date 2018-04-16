import java.util.*;

public class ElementFinder{
  public static void main(String... args){
    ArrayList<Integer> arrayList = new ArrayList(Arrays.asList(1,2,3,4,5));
    System.out.println(containsSeven(arrayList));
    // Write a method that checks if the arrayList contains "7"
    // if it contains return "Hoorray" otherwise return "Noooooo"
    // The output should be: "Noooooo"
    // Do this again with a different solution using different list methods!

    ArrayList<Integer> arrayList2 = new ArrayList(arrayList);
    arrayList2.add(7);
    System.out.println(containsSeven(arrayList2));
  }

  public static String containsSeven(ArrayList numbers) {
    if (numbers.contains(7)) {
      return "Hoorraay";
    } else {return "Noooooo";}
  }

}