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

        int lives = 0;
        String level;
        int boundLower; int boundUpper;
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome in my GuessGame. Do you want to play easy, medium or hard? (e/m/h)");
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




    }
}
