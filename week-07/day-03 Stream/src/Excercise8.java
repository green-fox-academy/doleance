import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Excercise8 {
    public static void main(String[] args) {
        //find the frequency of numbers

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(5, 9, 1, 2, 3, 7,
                5, 6, 7, 3, 7, 6, 8, 5, 4, 9, 6, 2));

        Map<Integer, Integer> intMap = numbers.stream()
                .collect(groupingBy())
    }
}
