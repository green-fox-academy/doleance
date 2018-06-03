import java.util.Scanner;

public class CAB {

    private int number;
    private boolean isItFinished;
    private int howManyGuesses;
    private int bulls;
    private int cows;

    public CAB() {
        number = (int)(Math.random() * 10000);
        //In the game 0 will be 0000, and 28 will be 0028. i hope.
        bulls = 0;
        cows = 0;
        isItFinished = false;
        howManyGuesses = 0;
    }

    public void game() {
        do {
            System.out.print("What's your guess? ");
            Scanner scanner = new Scanner(System.in);
            guess(scanner.nextInt());
        } while (!isItFinished);
        System.out.println("Congrats! That was the right number!");
    }

    public void guess(int guessedNumber) {
        bulls = 0; cows = 0;
        decimalIsOkay(guessedNumber, 1000);
        howManyGuesses++;
        System.out.println("You have " + cows + " cows and " + bulls + " bulls.");
    }

    private void decimalIsOkay(int guessedNumber, int divider) {
        if (guessedNumber / divider == number / divider) {
            cows++;
        } else {
            bulls++;
        }
        if (divider > 1) {
            decimalIsOkay(guessedNumber % divider, divider / 10);
        } else {
            if (cows == 4) {
                isItFinished = true;
            }
        }
    }
}
