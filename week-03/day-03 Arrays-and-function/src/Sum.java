//  Create the usual class wrapper
//  and main method on your own.

// - Write a function called `sum` that sum all the numbers
//   until the given parameter and returns with an integer
public class Sum {
    public static void main(String[] args) {
        int lastNumber = 10;
        System.out.println(sumToN(lastNumber));

    }

    public static int sumToN(int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += i + 1;
        }
        return sum;
    }
}
