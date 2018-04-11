import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {
        // Write a program that asks for two numbers and prints the bigger one

        Scanner scan = new Scanner(System.in);
        System.out.print("Now I want two numbers. ");
        int number1 = scan.nextInt(); int number2 = scan.nextInt();
        if (number1 < number2) {
            System.out.println(number2+" is bigger.");
        } else {
            System.out.println(number1+" is bigger.");
        }

    }
}
