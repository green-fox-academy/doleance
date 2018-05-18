import java.util.ArrayList;
import java.util.Arrays;

public class Excercise6 {
    public static void main(String[] args) {
     //find the strings which starts with A and ends with I

        ArrayList<String> cities = new ArrayList<>(Arrays.asList("ROME", "LONDON", "NAIROBI",
                "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS"));

        cities.parallelStream()
                .filter(city -> city.startsWith("A") & city.endsWith("I"))
                .forEach(city -> System.out.print(city + " "));


    }
}
