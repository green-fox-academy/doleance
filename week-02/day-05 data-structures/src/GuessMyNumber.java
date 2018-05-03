//Write a program where the program chooses a number between 1 and 100.
//The player is then asked to enter a guess. If the player guesses wrong,
//then the program gives feedback and ask to enter an other guess until the guess is correct.
//  Make the range customizable (ask for it before starting the guessing).
//  You can add lives. (optional)
//Example
//I've the number between 1-100. You have 5 lives.
//
//20
//
//Too high. You have 4 lives left.
//
//10
//
//Too low. You have 3 lives left.
//
//15
//
//Congratulations. You won!

import java.util.Scanner;

public class GuessMyNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome in my GuessGame.");
        char wannaPlay;

        do {
            int lives = defineLevel(scan);
            int myNumber = defineRange(scan);
            boolean won = false;

            System.out.println("Now, let's start the game!");
            while (lives != 0) {
                System.out.print("What's your guess? ");
                int tempGuess = scan.nextInt();
                lives--;
                if (tempGuess > myNumber) {
                    System.out.println("Too high. " + yourLives(lives));
                } else if (tempGuess < myNumber) {
                    System.out.println("Too low. " + yourLives(lives));
                } else {
                    System.out.println("Congratulations! You won!");
                    lives = 0;
                    won = true;
                }
            }
            if (!won) {
                System.out.print ("Sorry, maybe next time.");
            }
            System.out.println(" Wanna play again? (y/n) ");
            //System.out.println("@"+scan.nextLine()+"@");
            scan.nextLine();
            wannaPlay = scan.nextLine().charAt(0);
        } while (wannaPlay == 'y');

    }

    private static String yourLives(int lives) {
        if (lives > 0) {
            return lives + " life left.";
        } else if (lives < 0) {
            return "You have infinite lives, so keep going.";
        } else {
            return "";
        }
    }


    private static int defineLevel(Scanner scan) {
        int lives;
        String level;
        System.out.println("Do you want to play easy, medium or hard? (e/m/h)");
        level = scan.nextLine();
        if (level.equals("e")) {
            lives=-2;
        } else if (level.equals("m")) {
            lives = 10;
        } else {
            lives = 5;
        }
        if (lives == -2) {
            System.out.println("Okay, you have infinite lives.");
        } else {
            System.out.printf("Okay, you have %d lives.%n", lives);
        }
        return lives;
    }

    private static int defineRange(Scanner scan) {
        int boundLower; int boundUpper;
        System.out.println("Give me to bounds (a lower and an upper) in between I can think about number.");
        boundLower = scan.nextInt(); boundUpper = scan.nextInt();
        return (int)((Math.random() * boundUpper) + boundLower);
    }

}
