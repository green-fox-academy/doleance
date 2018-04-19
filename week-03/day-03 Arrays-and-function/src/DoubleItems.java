// - Create an array variable named `ag`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Double all the values in the array

public class DoubleItems {
    public static void main(String[] args) {

        int[] ag = {3, 4, 5, 6, 7};
        ag = doubleValues(ag);
        printArray(ag);
    }

    private static void printArray(int[] array) {
        System.out.print("Your array's elements: ");
        for (int element : array) {
            System.out.print(element + " ");
        }
    }

    private static int[] doubleValues(int[] array) {
        int[] temp = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            temp[i] = 2 * array[i];
        }
        return temp;
    }
}
