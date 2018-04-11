import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        // Write a program that asks for an integer that is a distance in kilometers,
        // then it converts that value to miles and prints it

        Scanner scan = new Scanner(System.in);
        System.out.print("How many kilometers do you have? ");
        int kiloMeters = scan.nextInt();
        System.out.println("Then you have " +(kiloMeters/1.609344)+" miles.");

    }
}