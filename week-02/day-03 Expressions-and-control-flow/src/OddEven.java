import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
// Write a program that reads a number from the standard input,
// Then prints "Odd" if the number is odd, or "Even" if it is even.

        Scanner scan = new Scanner(System.in);
        {
            System.out.print("Now gimme please a number. I'll tell you if it's odd or even. ");
            int number = scan.nextInt();
            if (number % 2 == 0) {
                System.out.println("It's even.");
            } else {
                System.out.println("It's odd. Sorry.");
            }
        }

    }

}
