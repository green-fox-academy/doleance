import java.util.ArrayList;
import java.util.Collections;

public class Sum {

    public static int sum(ArrayList<Integer> numbers) throws NullPointerException {

        if (numbers == null) {
            throw new NullPointerException("Gyökér vagy, fiam, adjál igazi listát.");
        }

        numbers.removeAll(Collections.singleton(null));

        int sum = 0;
        if (numbers.size() > 0) {
            for (int number : numbers) {
                    sum += number;
            }
        }
        return sum;
    }

}
