//  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `factorio`
//   that returns it's input's factorial
public class Factorio {
    public static void main(String[] args) {
        int number = 3;
        System.out.println(factorio(number));
        
    }

    private static int factorio(int firstHowManyNaturalNumber) {
        int fact=1;
        for (int i = 0; i < firstHowManyNaturalNumber; i++) {
            fact *= i+1;
        }
        return fact;
    }
}
