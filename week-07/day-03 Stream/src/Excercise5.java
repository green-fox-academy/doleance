import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Excercise5 {
    public static void main(String[] args) {
        //Write a Stream Expression to find the uppercase characters in a string!

        String myString = "kéKAKeZeM";

        System.out.println(myString.chars()
                .filter(c -> c > 64 && c < 91)
                .mapToObj(c -> ((char) c) + "")
                .collect(Collectors.joining(" ")));


        System.out.println("Your uppercase letters in your string:");
        for (char c : myString.toCharArray()) {
           if (("" + c).toUpperCase().equals("" + c)) {
                System.out.print(c + " ");
            }
        }
    }
}
