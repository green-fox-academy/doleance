import java.util.Scanner;

// Write a program that asks for a number.
// It would ask this many times to enter an integer,
// if all the integers are entered, it should print the sum and average of these
// integers like:
//
// Sum: 22, Average: 4.4

public class ParametricAverage {
    public static void main(String[] args) {
        System.out.println("How many numbers do you want me to make a statistic of?");
        Scanner scanner = new Scanner(System.in);
        int dataScale = scanner.nextInt();
        int sum=0;
        for (int i=0;i<dataScale;i++)
        {
            System.out.println("Your "+(i+1)+"th number: ");
            sum += scanner.nextInt();
        }
        System.out.println("Sum: "+sum+", Average: "+(sum/(double)dataScale));

    }
}
