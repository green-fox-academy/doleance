import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {
// Write a program that asks for 5 integers in a row,
// then it should print the sum and the average of these numbers like:
//
// Sum: 22, Average: 4.4
        Scanner scan = new Scanner(System.in);
        System.out.println("Please give me 5 numbers. ");
        int statNumber1 = scan.nextInt();
        int statNumber2 = scan.nextInt();
        int statNumber3 = scan.nextInt();
        int statNumber4 = scan.nextInt();
        int statNumber5 = scan.nextInt();
        int statSum = statNumber1+statNumber2+statNumber3+statNumber4+statNumber5;
        System.out.println("Sum: "+statSum+", average: "+(statSum/5));
    }
}
