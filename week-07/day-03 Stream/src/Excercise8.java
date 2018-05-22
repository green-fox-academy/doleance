import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class Excercise8 {
    public static void main(String[] args) {
        //find the frequency of numbers

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(5, 9, 1, 2, 3, 7,
                5, 6, 7, 3, 7, 6, 8, 5, 4, 9, 6, 2));

        Map<Integer, Long> intMap = numbers.stream()
                .collect(groupingBy(Function.identity(), counting()));

        System.out.println(intMap);
    }
}
