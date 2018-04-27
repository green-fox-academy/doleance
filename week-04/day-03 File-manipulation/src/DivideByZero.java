// Create a function that takes a number
// divides ten with it,
// and prints the result.
// It should print "fail" if the parameter is 0

import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        TenDivider(scan.nextInt());
    }

    private static void TenDivider(int divider) {
        int whatToDivide = 10;
        try {
            System.out.println(whatToDivide / divider);
        } catch (ArithmeticException zero) {
            System.out.println("fail");
        }
    }
}
