import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The second represents the number of pigs owned by the farmer
        // It should print how many legs all the animals have

        Scanner scan = new Scanner(System.in);
        System.out.println("Please give me two numbers. The number of your chiken, and the number of your pigs. ");
        int chicks = scan.nextInt();
        int pigs = scan.nextInt();
        System.out.println("Then all your animals have " + (chicks * 2 + pigs * 4) + " legs.");
    }
}