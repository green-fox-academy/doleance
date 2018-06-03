import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Excercise9 {
    public static void main(String[] args) {
        //Write a Stream Expression to convert a char array to a string!

        char[] charArray = {'c', 'H', 'a', 'r', 'A', 'r', 'R', 'a', 'y'};

        String stringFromCharArray = Stream.of(charArray)
                .map(String::valueOf)
                .collect(Collectors.joining());

        System.out.println(charArrayToString(charArray));
        System.out.println(charArrayToString2(charArray));
        System.out.println(stringFromCharArray);
        System.out.println(stringFromCharArray.getClass());
    }

    private static String charArrayToString2(char[] charArray) {
        return String.valueOf(charArray);
    }

    private static String charArrayToString(char[] charArray) {
        StringBuilder stringBuilder = new StringBuilder();
        for ( char c : charArray) {
            stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }
}
