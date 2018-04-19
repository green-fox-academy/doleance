// - Create an array variable named `r`
//   with the following content: `[54, 23, 66, 12]`
// - Print the sum of the second and the third element

public class SumElements {
    public static void main(String[] args) {
        int[] r = {54,23,66,12};
        System.out.println(sumOfTheSecondAndThird(r));
    }

    private static int sumOfTheSecondAndThird(int[] arrayToSum) {
        return arrayToSum[1]+arrayToSum[2];

    }
}
