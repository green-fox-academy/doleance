import java.util.Scanner;

public class DrawDiamond {
    public static void main(String[] args) {
    // Write a program that reads a number from the standard input, then draws a
    // diamond like this:
    //
    //
    //    *
    //   ***
    //  *****
    // *******
    //  *****
    //   ***
    //    *
    //
    // The diamond should have as many lines as the number was

        Scanner scan2 = new Scanner(System.in);
        System.out.println("I can draw pyramid too. Wanna see? How big should it be?");
        int pyramidRows = scan2.nextInt();
        for (int i=1;i<=pyramidRows;i++)
        {
            for (int j=0;j<((2*pyramidRows-1-(2*i-1))/2);j++)
            {
                System.out.print(" ");
            }
            for (int cs=0;cs<(i*2-1);cs++)
            {
                System.out.print("*");
            }
            for (int j=0;j<((2*pyramidRows-1-(2*i-1))/2);j++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
        pyramidRows --;
        for (int i=pyramidRows;i>=1;i--)
        {
            for (int j=((2*pyramidRows-1-(2*i-1))/2);j>=0;j--)
            {
                System.out.print(" ");
            }
            for (int cs=(i*2-1);cs>0;cs--)
            {
                System.out.print("*");
            }
            for (int j=((2*pyramidRows-1-(2*i-1))/2);j>=0;j--)
            {
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}
