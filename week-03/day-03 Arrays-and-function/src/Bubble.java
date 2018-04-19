import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        //  Create a function that takes a list of numbers as parameter
        //  Returns a list where the elements are sorted in ascending numerical order
        //  Make a second boolean parameter, if it's `True` sort that list descending

        //  Example:
        System.out.println(bubble(new int[]{34, 12, 24, 9, 5}));
        //  should print [5, 9, 12, 24, 34]
        System.out.println(advancedBubble(new int[]{34, 24, 12, 9, 5}, true));
        //  should print [34, 24, 12, 9, 5]
    }

    private static String bubble(int[] ints) {
        Arrays.sort(ints);
        return Arrays.toString(ints);
    }

    private static String advancedBubble(int[] ints, boolean desc) {
        Arrays.sort(ints);
        if (desc) {
            return Arrays.toString(reverseArray(ints));
        } else {
            return Arrays.toString(ints);
        }

    }

    private static int[] reverseArray(int[] array) {
        int[] revArray = new int[array.length];
        for (int i = array.length-1; i >= 0; i--) {
            revArray[array.length - i - 1] = array[i];
        }
        return revArray;
        //vagy megcsinálom azzal, amikor length/2-ig megyek, és felcserélem az i-ediket a length-i(-1) edikkel.
        //Melyik hatékonyabb?
    }
}