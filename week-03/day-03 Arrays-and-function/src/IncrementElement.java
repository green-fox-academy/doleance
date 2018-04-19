// Create an array variable named `t`
// with the following content: `[1, 2, 3, 4, 5]`
// Increment the third element
// Print the third element
public class IncrementElement {
    public static void main(String[] args) {
        int[] t = {1, 2, 3, 4, 5};
        increaseElement(t, 3);
        printElement(t, 3);
    }

    private static void increaseElement(int[] array, int whichElement) {
        array[whichElement - 1]++;
    }

    private static void printElement(int[] array, int whichElement) {
        System.out.println(array[whichElement-1]);
    }

}
