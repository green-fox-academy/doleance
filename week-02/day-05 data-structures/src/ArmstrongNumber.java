import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Which number are you interested in?");
        int number = scan.nextInt();

        if (armstrongIsThatYou(number)) {
            System.out.println("It's Armstrong!");
        } else {
            System.out.println("It's someone else.");
        }
    }

    private static boolean armstrongIsThatYou(int number) {
        boolean isItArmstrong = false;

        int numberSafe = number;
        int howManyDigits = 0;
        int poweredDigits = 0;

        while (number > 0) {
            howManyDigits++;
            number /= 10;
        }
        number = numberSafe;
        for (int i = 0; i < howManyDigits; i++) {
            poweredDigits += Math.pow(number % 10, howManyDigits);
            number /= 10;
        }
        return (poweredDigits == numberSafe);
    }
}
