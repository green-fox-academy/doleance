// - Create an array variable named `ai`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Print the sum of the elements in `ai`
public class SumAll {
    public static void main(String[] args) {
        int[] ai = {3, 4, 5, 6};
        System.out.println(sumElements(ai));
    }

    private static int sumElements(int[] array) {
        int sum = 0;
        for ( int e : array) {
            sum += e;
        }
        return sum;
    }
}
