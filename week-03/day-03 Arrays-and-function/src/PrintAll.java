// - Create an array variable named `af`
//   with the following content: `[4, 5, 6, 7]`
// - Print all the elements of `af`
public class PrintAll {
    public static void main(String[] args) {
        int[] af = {4, 5, 6, 7};
        printAllElement(af);
    }

    private static void printAllElement(int[] arrayToPrint) {
        System.out.print("Your array contains: ");
        for (int element : arrayToPrint) {
            System.out.print(element+" ");
        }

    }
}
