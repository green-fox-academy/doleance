import java.util.*;

public class Matchmaking{
  public static void main(String... args) {
    ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve","Ashley","Bözsi","Kat","Jane"));
    ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe","Fred","Béla","Todd","Neef","Jeff"));

    // Write a method that joins the two lists by matching one girl with one boy into a new list
    // Exepected output: "Eve", "Joe", "Ashley", "Fred"...

    System.out.println(makingMatches(girls, boys));
  }

  public static ArrayList<String> makingMatches(ArrayList<String> listOne, ArrayList<String> listOther) {
    ArrayList<String> matches = new ArrayList<String>(listOther);
    for (int i = 0; i < listOne.size(); i++) {
      matches.add(2*i,listOne.get(i));
    }
    return matches;
  }

}