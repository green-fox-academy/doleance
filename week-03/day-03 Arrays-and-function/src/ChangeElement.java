// - Create an array variable named `s`
//   with the following content: `[1, 2, 3, 8, 5, 6]`
// - Change the 8 to 4
// - Print the fourth element

public class ChangeElement {
    public static void main(String[] args) {
        int[] s = {1, 2, 3, 8, 5, 6};
        changeElement(s,4,4);
        printElement(s,4);
    }

    private static void printElement(int[] array, int whichElement) {
        System.out.println(array[whichElement-1]);
    }

    private static void changeElement(int[] array, int whichElement, int newValue) {
        array[whichElement-1]=newValue;
    }
}
