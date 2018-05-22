import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Excercise9 {
    public static void main(String[] args) {
        //Write a Stream Expression to convert a char array to a string!

        char[] charArray = {'c', 'h', 'a', 'r', 'a', 'r', 'r', 'a', 'y'};

        String stringFromCharArray = (String)IntStream
                .range(0, charArray.length)
                .mapToObj(i -> charArray[i])
                .toString();


        System.out.println(stringFromCharArray);
        System.out.println(stringFromCharArray.getClass());



    }
}
