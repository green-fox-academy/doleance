import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class Excercise7 {
    public static void main(String[] args) {
        //find the frequency of characters in a given string!

        String givenString = "téglalappal";

        Map<Character, Long> charMap = givenString.chars()
                .mapToObj(c -> Character.valueOf((char)c))
                .collect(groupingBy(Function.identity(), counting()));

        System.out.println(charMap);
    }
}
