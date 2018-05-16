public class Fibonacci {

    public int NthFibonacci(int whichFibonacciNumber){
        if (whichFibonacciNumber < 0) {
            return (NthFibonacci(whichFibonacciNumber + 2) - NthFibonacci(whichFibonacciNumber + 1));
        } else if (whichFibonacciNumber == 0) {
            return 0;
        } else if (whichFibonacciNumber == 1) {
            return 1;
        } else {
            return (NthFibonacci(whichFibonacciNumber - 2) + NthFibonacci(whichFibonacciNumber - 1));
        }
    }

}
