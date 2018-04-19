// - Create an array variable named `abc`
//   with the following content: `["first", "second", "third"]`
// - Swap the first and the third element of `abc`
public class SwapElements {
    public static void main(String[] args) {
        String[] abc = {"first", "second", "third"};
        swapElements(abc,1,3);
        printArray(abc);
    }

    private static void swapElements(String[] array, int toSwap1, int toSwap2) {
        String tempelem = array[toSwap1-1];
        array[toSwap1-1] = array[toSwap2-1];
        array[toSwap2-1] = tempelem;
    }

    private static void printArray(String[] array) {
        for (String e:array) {
            System.out.print(e+" ");
        }
    }
}
