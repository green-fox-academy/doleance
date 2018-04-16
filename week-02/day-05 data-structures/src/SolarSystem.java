import java.util.*;

public class SolarSystem {
    public static void main(String... args) {
        ArrayList<String> planetList = new ArrayList<String>(Arrays.asList("Mercury", "Venus", "Earth", "Mars",
                "Jupiter", "Uranus", "Neptune"));

        // Saturn is missing from the planetList
        // Insert it into the correct position
        // Create a method called putSaturn() which has list parameter and returns the correct list.

        System.out.println(String.join(", ",putSaturn(planetList)));
        // Expected output: "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Uranus", "Neptune", "Saturn"
    }

    public static ArrayList<String> putSaturn(ArrayList<String> originalList) {
        ArrayList<String> newList = new ArrayList<String>();
        newList.addAll(originalList);
        newList.add(5, "Saturn");
        return newList;
    }

    //már csak azt kéne kitalálni, hogy fogja szépen idézőjelezgetni. pl így:

    public static String putSaturn2(ArrayList<String> originalList) {
    String newList = "\"";
        for (int i = 0; i < originalList.size()-1; i++) {
            newList += originalList.get(i) + "\", \"";
        }
        newList += originalList.get(originalList.size()-1) + "\"";
        return newList;
    }

    //nope. String.join

}