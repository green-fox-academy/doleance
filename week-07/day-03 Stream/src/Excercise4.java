import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class Excercise4 {
    public static void main(String[] args) {
        //which number squared value is more than 20

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(3, 9, 2, 8, 6, 5));

        System.out.println(numbers.stream()
                .filter(n -> Math.pow(n,2) > 20)
                .collect(Collectors.toList()));

    }
}
