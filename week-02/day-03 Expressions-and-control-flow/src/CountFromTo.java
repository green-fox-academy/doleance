import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args) {
    // Create a program that asks for two numbers
    // If the second number is not bigger than the first one it should print:
    // "The second number should be bigger"
    //
    // If it is bigger it should count from the first number to the second by one
    //
    // example:
    //
    // first number: 3, second number: 6, should print:
    //
    // 3
    // 4
    // 5
        Scanner scan2 = new Scanner(System.in);
        System.out.print("I can count from any number up to any other number! Wanna try? Gimme 2 numbers: ");
        int fromNum=scan2.nextInt(); int toNum=scan2.nextInt();
        if (fromNum>toNum) {System.out.println("Hey, that's cheating! The second number should be bigger.");}
        else {
            for (int i = fromNum; i < toNum; i++) {
                System.out.println(i);
            }
        }

    }
}
