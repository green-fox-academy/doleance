import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
    // Write a program that stores a number, and the user has to figure it out.
    // The user can input guesses, after each guess the program would tell one
    // of the following:
    //
    // The stored number is higher
    // The stried number is lower
    // You found the number: 8

        int guessNumber=213;
        System.out.println("I've tought about a number between 1-1000. Do you have a guess?");
        Scanner guessScan = new Scanner(System.in);
        int tip=guessScan.nextInt();
        while (tip!=guessNumber) {
            if (tip<guessNumber) {
                System.out.println("The stored number is higher.");
            } else {
                System.out.println("The stored number is lower.");
            }
            tip=guessScan.nextInt();
        }
        System.out.println("You've found the number: "+guessNumber);

    }
}
